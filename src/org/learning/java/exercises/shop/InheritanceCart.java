package org.learning.java.exercises.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class InheritanceCart {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // chiedo quanti prodotti vuole inserire
    System.out.print("How many products? ");
    int cartSize = Integer.parseInt(scanner.nextLine());
    // con questa dimensione creo un array di Product
    Product[] cart = new Product[cartSize];
    // per ogni posizione dell'array carrello devo chiedere di inserire un prodotto
    for (int i = 0; i < cart.length; i++) {
      System.out.println("Insert product " + (i + 1));

      boolean invalidChoice;

      do {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Price: ");
        String priceString = scanner.nextLine();
        System.out.print("Vat: ");
        String vatString = scanner.nextLine();

        System.out.print("Which product? 1-Smartphone, 2-Television, 3-HeadSet");
        String choice = scanner.nextLine();
        // in base alla scelta crea Smarpthone o Television o HeadSet
        switch (choice) {
          case "1":
            System.out.println("Smartphone");
            invalidChoice = false;
            // istanzio uno smartphone
            System.out.print("IMEI code: ");
            String imeiCode = scanner.nextLine();
            System.out.print("Memory: ");
            int memory = Integer.parseInt(scanner.nextLine());
            Smartphone smartphone = new Smartphone(name, description, new BigDecimal(priceString),
                new BigDecimal(vatString), imeiCode, memory);
            // aggiungo lo smatphone all'array cart
            cart[i] = smartphone;
            break;
          case "2":
            System.out.println("Television");
            invalidChoice = false;
            // istanzio un Television
            System.out.print("Dimensions: ");
            int dimensions = Integer.parseInt(scanner.nextLine());
            System.out.print("Smart?y/n ");
            boolean smart = scanner.nextLine().equalsIgnoreCase("y");
            Television television = new Television(name, description, new BigDecimal(priceString),
                new BigDecimal(vatString), dimensions, smart);
            // aggiungo il television all'array cart
            cart[i] = television;
            break;
          case "3":
            System.out.println("HeadSet");
            invalidChoice = false;
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Wireless?y/n ");
            boolean wireless = scanner.nextLine().equalsIgnoreCase("y");
            HeadSet headSet = new HeadSet(name, description, new BigDecimal(priceString),
                new BigDecimal(vatString), color, wireless);
            // aggiungo l'headset all'array cart
            cart[i] = headSet;
            break;
          default:
            System.out.println("Invalid choice");
            invalidChoice = true;
            break;
        }
      } while (invalidChoice);


    }

    // itero sul carrello per mostrare i vari prodotti e calcolare il totale
    BigDecimal total = new BigDecimal(0);
    for (Product p : cart) {
      System.out.println(p);
      // aggiorno il totale
      total = total.add(p.getFullPrice());
    }
    System.out.println("TOTAL: " + total + "€");

    scanner.close();
  }
}
