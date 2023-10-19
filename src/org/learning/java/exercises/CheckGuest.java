package org.learning.java.exercises;

import java.util.Scanner;

public class CheckGuest {

  public static void main(String[] args) {
    // lista invitati
    String[] guests = {
        "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
        "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
    // scanner per leggere input da tastiera
    Scanner scan = new Scanner(System.in);
    // chiedo all'utente come si chiama
    System.out.print("What's your name? ");
    String name = scan.nextLine();

    // cerco il nome nell'array di invitati
    boolean found = false;
    for (int i = 0; i < guests.length && !found; i++) {
      // ad ogni iterazione confronto il nome dell'utente con il valore all'indice corrente dell'array
      if (name.equals(guests[i])) {
        found = true;
        //break;
      }
    }
/*    int counter = 0;
    while (!found && counter < guests.length) {
      // confronto il nome con il nome corrente dell'array
      if (name.equals(guests[counter])) {
        found = true;
      }
      counter++;
    }*/

    // a seconda del valore di found so se ho trovato o ho il nome
    System.out.println(found ? "Welcome!" : "Goodbye");

    // chiudo lo scanner
    scan.close();
  }
}
