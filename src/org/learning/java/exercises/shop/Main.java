package org.learning.java.exercises.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Insert name: ");
    String name = scan.nextLine();
    System.out.print("Insert description: ");
    String description = scan.nextLine();
    System.out.print("Insert price: ");
    String priceString = scan.nextLine();
    System.out.print("Insert vat: ");
    String vatString = scan.nextLine();
    // creo una istanza di Product
    Product product = new Product(name, description, new BigDecimal(priceString),
        new BigDecimal(vatString));
    System.out.println(product.getFullName());
    System.out.println(product.getFullPrice() + "€");
    scan.close();
  }
}
