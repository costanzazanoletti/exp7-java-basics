package org.learning.java.exercises;

import java.util.Scanner;

public class StringToNumber {

  /*
   * Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
   * */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Insert a number: ");
    String numberString = scan.nextLine();
    // "123" -> '1','2','3'

    // dichiaro la variabile che contiene il risultato
    int result = 0;

    // itero sui singoli caratteri e cerco di capire che numero è
    for (int i = 0; i < numberString.length(); i++) {
      char currentChar = numberString.charAt(i);
      int digit;
      // con uno switch testo il valore del carattere corrente
      switch (currentChar) {
        case '1':
          digit = 1;
          break;
        case '2':
          digit = 2;
          break;
        case '3':
          digit = 3;
          break;
        case '4':
          digit = 4;
          break;
        case '5':
          digit = 5;
          break;
        case '6':
          digit = 6;
          break;
        case '7':
          digit = 7;
          break;
        case '8':
          digit = 8;
          break;
        case '9':
          digit = 9;
          break;
        default:
          digit = 0;
          break;
      }
      System.out.println("current digit: " + digit);
      // aggiorno la cifra complessiva tenendo conto della posizione della cifra
      result = result * 10 + digit;
    }

    System.out.println("The number is: " + result);
    scan.close();
  }
}
