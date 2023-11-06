package org.learning.java.exercises.dbcountries;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  private final static String FORMAT_PATTERN = "%4s%50s%30s%30s\n";
  private final static String DB_URL = System.getenv("DB_URL");
  private final static String DB_USER = System.getenv("DB_USER");
  private final static String DB_PASSWORD = System.getenv("DB_PASSWORD");

  private final static String QUERY_COUNTRIES = """
            SELECT c.name as country_name, c.country_id , r.name as region_name, c2.name as continent_name
            FROM countries c
            JOIN regions r ON c.region_id = r.region_id
            JOIN continents c2 ON r.continent_id = c2.continent_id
            ORDER BY c.name;
      """;
  private final static String QUERY_COUNTRIES_FILTERED = """
            SELECT c.name as country_name, c.country_id , r.name as region_name, c2.name as continent_name
            FROM countries c
            JOIN regions r ON c.region_id = r.region_id
            JOIN continents c2 ON r.continent_id = c2.continent_id
            WHERE c.name LIKE ?
            ORDER BY c.name;
      """;
  private final static String QUERY_COUNTRY_DETAILS = """
      SELECT *
      FROM countries
      WHERE country_id = ?;
      """;

  private final static String QUERY_COUNTRY_LANGUAGES = """
      SELECT l.`language`
      FROM languages l
      JOIN country_languages cl ON l.language_id = cl.language_id
      WHERE country_id = ?;
      """;

  private final static String QUERY_COUNTRY_STATS = """
      SELECT *
      FROM country_stats cs
      WHERE country_id = ?
      ORDER BY `year` DESC
      LIMIT 1;
      """;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
      System.out.print("Search countries: ");
      String search = scanner.nextLine();
      int numResults = showCountryList(connection, search);
      if (numResults > 0) {
        System.out.print("Choose a country id");
        int countryId = Integer.parseInt(scanner.nextLine());
        boolean countryExists = showCountryDetails(connection, countryId);
        if (countryExists) {
          showCountryLanguages(connection, countryId);
          showCountryStats(connection, countryId);
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    scanner.close();
  }

  private static void showCountryStats(Connection connection, int countryId) throws SQLException {
    try (PreparedStatement preparedStatement = connection.prepareStatement(QUERY_COUNTRY_STATS)) {
      preparedStatement.setInt(1, countryId);
      try (ResultSet resultSet = preparedStatement.executeQuery()) {
        if (resultSet.next()) {
          int year = resultSet.getInt("year");
          BigDecimal population = resultSet.getBigDecimal("population");
          BigDecimal gdp = resultSet.getBigDecimal("gdp");
          System.out.println("COUNTRY STATS");
          System.out.println("Year: " + year);
          System.out.println("Population: " + population);
          System.out.println("GDP: " + gdp);
        } else {
          System.out.println("No stats for this country");
        }
      }
    }
  }

  private static void showCountryLanguages(Connection connection, int countryId)
      throws SQLException {
    try (PreparedStatement preparedStatement = connection.prepareStatement(
        QUERY_COUNTRY_LANGUAGES)) {
      preparedStatement.setInt(1, countryId);
      try (ResultSet resultSet = preparedStatement.executeQuery()) {
        List<String> languages = new ArrayList<>();
        while (resultSet.next()) {
          languages.add(resultSet.getString("language"));
        }
        System.out.println(
            "Languages: " + String.join(", ", languages));
      }
    }
  }

  private static boolean showCountryDetails(Connection connection, int countryId)
      throws SQLException {
    boolean exists = false;
    try (PreparedStatement preparedStatement = connection.prepareStatement(
        QUERY_COUNTRY_DETAILS)) {
      preparedStatement.setInt(1, countryId);
      try (ResultSet resultSet = preparedStatement.executeQuery()) {
        if (resultSet.next()) {
          exists = true;
          String name = resultSet.getString("name");
          BigDecimal area = resultSet.getBigDecimal("area");
          Date nationalDay = resultSet.getDate("national_day");
          String countryCode2 = resultSet.getString("country_code2");
          String countryCode3 = resultSet.getString("country_code3");
          System.out.println("DETAILS FOR COUNTRY: " + name);
          System.out.println("Area: " + area);
          if (nationalDay != null) {
            System.out.println("National Day: " + nationalDay);
          }
          System.out.println("Country codes: " + countryCode2 + ", " + countryCode3);
        } else {
          System.out.println("Invalid country id");
        }
      }
      return exists;
    }
  }

  private static int showCountryList(Connection connection, String search) throws SQLException {
    try (PreparedStatement preparedStatement = connection.prepareStatement(
        QUERY_COUNTRIES_FILTERED)) {
      preparedStatement.setString(1, "%" + search + "%");

      try (ResultSet resultSet = preparedStatement.executeQuery()) {
        System.out.format(FORMAT_PATTERN, "ID", "COUNTRY NAME", "REGION", "CONTINENT");
        int numResults = 0;
        while (resultSet.next()) {
          numResults++;
          String countryName = resultSet.getString("country_name");
          int countryId = resultSet.getInt("country_id");
          String regionName = resultSet.getString("region_name");
          String continentName = resultSet.getString("continent_name");
          System.out.format(FORMAT_PATTERN, countryId, countryName, regionName,
              continentName);

        }
        if (numResults == 0) {
          System.out.println("No countries matching search");
        }
        return numResults;
      }

    }
  }
}
