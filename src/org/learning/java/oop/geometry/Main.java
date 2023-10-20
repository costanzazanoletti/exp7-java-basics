package org.learning.java.oop.geometry;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // chiedo all'utente di darmi base e altezza
    System.out.print("Base: ");
    int base = scan.nextInt();

    System.out.print("Height: ");
    int height = scan.nextInt();

    // le assegno a una istanza di rettangolo
    /*Rectangle rectangle = new Rectangle();
    System.out.println(rectangle.base + " x " + rectangle.height);
    rectangle.base = base;
    rectangle.height = height;*/
    Rectangle rectangle = new Rectangle(base, height);
    System.out.println(rectangle.getBase() + " x " + rectangle.getHeight());

    // rectangle.base = -10;

    // stampo a video il perimetro
    int perimeter = rectangle.getPerimeter();
    System.out.println(perimeter);
    // adesso aumento base e altezza
    rectangle.increaseBase(5);
    rectangle.increaseHeight(50);
    // stampo il nuovo valore del perimetro
    System.out.println(rectangle.getPerimeter());

    scan.close();
  }
}
