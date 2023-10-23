package org.learning.java.exercises.shop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Cart {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Product product1 = new Product("yogurt", "strawberry yogurt", new BigDecimal("1.99"),
        new BigDecimal("0.18"));
    Product product2 = new Product("bread", "cereal bread", new BigDecimal("3.50"),
        new BigDecimal("0.18"));
    Product product3 = new Product("tomatoes", "red tomatoes", new BigDecimal("4.25"),
        new BigDecimal("0.22"));

    Product[] catalog = {product1, product2, product3};

    for (int i = 0; i < catalog.length; i++) {
      System.out.println(
          (i + 1) + ") " + catalog[i].getFullName() + ": " + catalog[i].getFullPrice() + "€");
    }

    System.out.println("Which product?");
    int choice = Integer.parseInt(scan.nextLine());
    Product chosenProduct = catalog[choice - 1];

    if (chosenProduct != null) {
      // creo un purchase di questo prodotto
      System.out.print("Quantity: ");
      int quantity = Integer.parseInt(scan.nextLine());
      Purchase purchase = new Purchase(LocalDate.now(), quantity, chosenProduct);
      System.out.println("Total: " + purchase.getTotal());
    }

    scan.close();
  }
}
