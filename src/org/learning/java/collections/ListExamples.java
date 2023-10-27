package org.learning.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExamples {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Will");
    names.add("Dustin");
    names.add("Max");
    names.add("Daisy");
    System.out.println(names);
    // metodo della classe di utilities Collections che riordina la lista
    Collections.sort(names);
    System.out.println(names);

    System.out.println(names);
    String secondElement = names.get(1);
    System.out.println(secondElement);
    names.remove("Dustin");
    System.out.println(names);
    System.out.println("*********");
    for (int i = 0; i < names.size(); i++) {
      System.out.println("Position " + i);
      System.out.println(names.get(i));
    }
    System.out.println("*********");
    for (String item : names) {
      System.out.println(item);
    }

    List<Integer> numbers = new ArrayList<>();
    int a = 0;
    int b = 1;
    numbers.add(a);
    numbers.add(b);
    numbers.add(100);


  }
}
