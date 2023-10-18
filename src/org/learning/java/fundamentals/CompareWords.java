package org.learning.java.fundamentals;

import java.util.Scanner;

public class CompareWords {

  /*
    programma che prende in ingresso da tastiera due parole e stampa quale è la più lunga
  * */
  public static void main(String[] args) {
    // inizializzo uno scanner da tastiera
    Scanner scan = new Scanner(System.in);
    // menu testuale
    System.out.print("First word: ");
    String firstWord = scan.nextLine();
    System.out.println("You wrote " + firstWord.toUpperCase());

    System.out.print("Second word: ");
    String secondWord = scan.nextLine();
    System.out.println("You wrote " + secondWord.toUpperCase());

    // calcolo la lunghezza di ciascuna parola
    int firstWordLength = firstWord.length();
    int secondWordLength = secondWord.length();

    // confronto le due lunghezze
    if (firstWordLength > secondWordLength) {
      System.out.println(firstWord + " is longer");
    } else if (secondWordLength > firstWordLength) {
      System.out.println(secondWord + " is longer");
    } else {
      System.out.println(firstWord + " and " + secondWord + " have equal length");
    }
    // chiudo lo scanner
    scan.close();
  }
}
