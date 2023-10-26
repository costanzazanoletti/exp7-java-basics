package org.learning.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExamples {

  public static void main(String[] args) {
    Set<String> names = new HashSet<>();
    names.add("Will");
    names.add("Dustin");
    names.add("Max");
    names.add("Lucas");
    System.out.println(names);
    names.add("Max");
    System.out.println(names);
    boolean containsMax = names.contains("Max");
    System.out.println("Contains Max? " + containsMax);
    System.out.println("************");
    for (String name : names) {
      System.out.println(name);
    }
    System.out.println("************");
    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
      String current = iterator.next();
      System.out.println(current);
    }
  }
}
