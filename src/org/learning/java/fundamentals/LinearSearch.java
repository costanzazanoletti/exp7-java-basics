package org.learning.java.fundamentals;

import java.util.Scanner;

public class LinearSearch {

  /*
   * costruisco un array di interi random
   * chiedo all'utente un numero da ricercare
   * verifico se quel numero è presente nell'insieme oppure no
   * */
  public static void main(String[] args) {
    // istanzio uno scanner
    Scanner scan = new Scanner(System.in);
    // per test creo l'array statico
    int[] numbers = {1, 2, 3, 5, 99, 44, 21};

    // chiedo all'utente un numero
    System.out.print("Search a number: ");
    int numberToFind = scan.nextInt();
    // verifico se quel numero è presente nell'insieme
    // inizializzo una variabile booleana che tiene traccia se ho trovato il numero
    boolean found = false;
    // itero sull'array e confronto ogni posizione col valore da trovare
    for (int i = 0; i < numbers.length; i++) {
      if (numberToFind == numbers[i]) {
        // se il valore alla posizione corrente è uguale al numero da trovare cambio il valore di found
        found = true;
        break;
      }
    }


    /*
    enhanced for
    for (int currentValue : numbers) {
      if (numberToFind == currentValue) {
        found = true;
      }
    }*/

    // se found è true allora ho trovato il numero
    if (found) {
      System.out.println("Found!");
    } else {
      // atrimenti non l'ho trovato
      System.out.println("Not found");
    }

    // chiudo lo scanner
    scan.close();
  }
}
