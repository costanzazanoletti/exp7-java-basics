package org.learning.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExamples {

  public static void main(String[] args) {
    Map<String, Double> temperatures = new HashMap<>();
    temperatures.put("Domodossola", 14.00);
    temperatures.put("Milano", 14.5);
    temperatures.put("Roma", 16.5);
    System.out.println(temperatures);

    temperatures.put("Roma", 17.3);
    System.out.println(temperatures);

    boolean containsNapoli = temperatures.containsKey("Napoli");
    System.out.println("Contains Napoli: " + containsNapoli);
    System.out.println(temperatures.containsValue(20.0));
    temperatures.remove("Domodossola");
    System.out.println(temperatures);

    Set<String> cities = temperatures.keySet();
    System.out.println(cities);
    // calcolo la media delle temperature
    double totalTemp = 0;
    Iterator<Double> tempIterator = temperatures.values().iterator();
    while (tempIterator.hasNext()) {
      double currentTemp = tempIterator.next();
      System.out.println("Current temp " + currentTemp);
      totalTemp += currentTemp;
    }
    double avgTemp = totalTemp / temperatures.size();
    System.out.println("Average temperature " + avgTemp);

    Iterator<String> keysIterator = temperatures.keySet().iterator();
    while (keysIterator.hasNext()) {
      String currentKey = keysIterator.next();
      Double value = temperatures.get(currentKey);
      System.out.println(currentKey + ": " + value + "degrees");
    }
  }
}
