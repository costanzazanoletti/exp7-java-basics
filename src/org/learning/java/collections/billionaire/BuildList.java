package org.learning.java.collections.billionaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuildList {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // chiedo all'utente di aggiungere persone alla lista
    List<Person> people = new ArrayList<>();

    boolean exit = false;

    //Person person = new Person();
    while (!exit) {
      System.out.println("Insert new person? y/n");
      exit = scanner.nextLine().equals("n");
      if (!exit) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Billions: ");
        int billions = Integer.parseInt(scanner.nextLine());
        //person.setName(name);
        //person.setBillions(billions);
        people.add(new Person(name, billions));
      }
    }
    System.out.println(people);
    scanner.close();
  }
}
