package org.learning.java.collections.billionaire;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // Person bezos = new Person("Jeff Bezos", 120);

    List<Person> people = new ArrayList<>();

    people.add(new Person("Jeff Bezos", 120));
    people.add(new Person("Warren Buffet", 150));
    people.add(new Person("Mark Zuckerberg", 80));
    people.add(new Person("Bill Gates", 100));

    System.out.println(people);
    // inserisco nel club dei 100 solo le persone che hanno un patrimonio >= 100
    List<Person> hundredClub = new ArrayList<>();
    System.out.println(hundredClub);
    // itero su tutta la lista
    for (Person person : people) {
      // aggiungo al club solo le persone che hanno patrimonio >= 100
      if (person.getBillions() >= 100) {
        hundredClub.add(person);
      }
    }

    System.out.println("Hundred Club");
    System.out.println(hundredClub);

    // voglio verificare se Jeff Bezos è nel club
    boolean isJeffInClub = hundredClub.contains(new Person("Jeff Bezos", 120));
    System.out.println("Is Jeff in the club? " + isJeffInClub);


  }
}
