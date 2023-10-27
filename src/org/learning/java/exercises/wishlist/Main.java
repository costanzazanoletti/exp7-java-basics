package org.learning.java.exercises.wishlist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Present p1 = new Present("flowers", "aunt Pina");
    Present p2 = new Present("bicycle", "dad");

    int compareResult = p1.compareTo(p2);
    System.out.println(compareResult);
    if (compareResult == 0) {
      System.out.println("p1 == p2");
    } else if (compareResult < 0) {
      System.out.println("p1 < p2");
    } else {
      System.out.println("p1 > p2");
    }

    LocalDate now = LocalDate.now();
    LocalDate tomorrow = LocalDate.now().plusDays(1);
    compareResult = now.compareTo(tomorrow);

    if (compareResult == 0) {
      System.out.println("now == tomorrow");
    } else if (compareResult < 0) {
      System.out.println("now < tomorrow");
    } else {
      System.out.println("now > tomorrow");
    }

    List<Present> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);

    System.out.println(list);
    // Ordino la lista di regali
    Collections.sort(list);
    System.out.println(list);

    //boolean containsPresent = list.contains(new Present("bicycle", "dad"));
    //System.out.println("Contains: " + containsPresent);
    list.remove(new Present("bicycle", "dad"));

    System.out.println(list);
  }
}
