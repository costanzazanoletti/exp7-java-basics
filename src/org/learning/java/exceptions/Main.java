package org.learning.java.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Insert base: ");
      int base = scanner.nextInt();
      System.out.print("Insert height: ");
      int height = scanner.nextInt();

      Rectangle r = new Rectangle(base, height);
      System.out.println(r);
    } catch (IllegalArgumentException e) {
      System.out.println("Base and height must be > 0");
    } catch (InputMismatchException e) {
      System.out.println("Invalid number");
    }

    scanner.close();
  }
}
