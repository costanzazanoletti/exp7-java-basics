package org.learning.java.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class InvertString {

  /*
  chiedo all'utente una parola e gliela stampo invertita
  * */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Insert word:");
    String word = scanner.nextLine();
    // trasformo la stringa in un array di char
    /*char[] chars = word.toCharArray();
    System.out.println(Arrays.toString(chars));

    // scorro l'array all'indietro
    for (int i = chars.length - 1; i >= 0; i--) {
      System.out.print(chars[i]);
    }*/

    char[] invertedChars = new char[word.length()];
    for (int i = word.length() - 1, j = 0; i >= 0 && j < word.length(); i--, j++) {
      //invertedChars[word.length() - i - 1] = word.charAt(i);
      invertedChars[j] = word.charAt(i);
    }
    String invertedString = String.valueOf(invertedChars);

    scanner.close();
  }
}
