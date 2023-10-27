package org.learning.java.exercises.wishlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeWishlist {

  private static final String FILE_PATH = "./resources/wishlist.txt";

  public static void main(String[] args) {
    // leggo la lista dei regali da file
    List<Present> wishlist = readListFromFile();
    // stampo la lista corrente
    printList(wishlist);

    // inizializzo lo scanner da tastiera
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    while (!exit) {
      // mostro quanti regali ci sono nella lista
      System.out.println("You currently have " + wishlist.size() + " presents in list");
      System.out.print("Insert a present? y/n");
      String choice = scanner.nextLine();
      switch (choice.toUpperCase()) {
        case "Y":
          // inserire un regalo nella lista
          System.out.print("What present? ");
          String description = scanner.nextLine();
          System.out.print("For whom? ");
          String person = scanner.nextLine();
          // creao un nuovo Present e lo aggiungo alla lista
          wishlist.add(new Present(description, person));
          break;
        case "N":
          // usciamo
          exit = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }
    // stampo la lista aggiornata
    printList(wishlist);
    // scrivo la lista su file
    writeListToFile(wishlist);

    System.out.println("Bye bye");
    scanner.close();
  }


  // METODI
  private static void writeListToFile(List<Present> wishlist) {
    try (FileWriter fileWriter = new FileWriter(FILE_PATH)) {
      for (Present present : wishlist) {
        fileWriter.write(present.getDescription() + ";" + present.getPerson() + "\n");
      }
    } catch (IOException e) {
      System.out.println("Unable to write file");
    }
  }

  private static void printList(List<Present> wishlist) {
    for (Present present : wishlist) {
      System.out.println("- " + present.getDescription() + " for " + present.getPerson());
    }
  }


  private static List<Present> readListFromFile() {
    List<Present> wishlist = new ArrayList<>();
    // leggo il file (se c'è)
    File file = new File(FILE_PATH);
    if (file.exists()) {
      try (Scanner fileReader = new Scanner(file)) {
        // leggo riga per riga
        while (fileReader.hasNextLine()) {
          String line = fileReader.nextLine();
          String[] elements = line.split(";");
          String description = elements[0];
          String person = elements[1];
          // a partire dagli elementi della riga creo un Present e lo aggiungo alla lista
          wishlist.add(new Present(description, person));
        }
        // aggiungo i regali scritti sul file alla mia lista
      } catch (FileNotFoundException e) {
        System.out.println("Unable to read file");
      }
    }
    return wishlist;
  }
}
