package org.learning.java.abstraction.geometry;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Which Polygon? 1-triangle 2-rectangle");
    String choice = scanner.nextLine();
    Polygon polygon = null;
    switch (choice) {
      case "1":
        System.out.println("triangle");
        System.out.print("Side1: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Side2: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Side3: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());
        polygon = new Triangle(side1, side2, side3, height);
        break;
      case "2":
        System.out.println("rectangle");
        System.out.print("Side1: ");
        double side1Rect = Double.parseDouble(scanner.nextLine());
        System.out.print("Side2: ");
        double side2Rect = Double.parseDouble(scanner.nextLine());
        polygon = new Rectangle(side1Rect, side2Rect);
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }

    if (polygon != null) {
      System.out.println("Perimeter: " + polygon.getPerimeter());
      System.out.println("Area: " + polygon.getArea());
    }

    scanner.close();
  }
}
