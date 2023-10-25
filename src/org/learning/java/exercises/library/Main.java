package org.learning.java.exercises.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import org.learning.java.exercises.library.exceptions.InvalidBookParameterException;

public class Main {

  public static void main(String[] args) {
    readFile();
    Scanner keyboardReader = new Scanner(System.in);
    // chiedo all'utente quanti libri aggiungere
    int numberOfBooks = 0;
    while (numberOfBooks <= 0) {
      try {
        System.out.print("How many books? ");
        numberOfBooks = Integer.parseInt(keyboardReader.nextLine());
        if (numberOfBooks <= 0) {
          System.out.println("The number must be positive");
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid number");
      }

    }

    // creo un array di quella dimensione
    Book[] catalog = new Book[numberOfBooks];
    // itero sull'array
    for (int i = 0; i < catalog.length; i++) {
      Book book = null;
      while (book == null) {
        try {
          System.out.println("*****************");
          System.out.println("Parameters for book " + (i + 1));
          // per ogni posizione creo un libro
          System.out.print("Title: ");
          String title = keyboardReader.nextLine();
          System.out.print("Authors: ");
          String authors = keyboardReader.nextLine();
          System.out.print("Publisher: ");
          String publisher = keyboardReader.nextLine();
          System.out.print("Number of pages: ");
          int numberOfPages = Integer.parseInt(keyboardReader.nextLine());
          book = new Book(title, authors, publisher, numberOfPages);
          // e lo aggiungo
          catalog[i] = book;
        } catch (NumberFormatException e) {
          System.out.println("Invalid number");

        } catch (InvalidBookParameterException e) {
          System.out.println("Invalid book parameter: " + e.getMessage());

        }
      }

    }

    // stampo l'array
    System.out.println(Arrays.toString(catalog));

    System.out.println("SCRIVO SU FILE");
    // lo scrivo su file
    // try-with-resources: non scrivo fileWriter.close() nel finally perchè lo fa automaticamente
    try (FileWriter fileWriter = new FileWriter("./resources/books.txt", true)) {
      // scrivo una riga per ogni Book
      for (Book book : catalog) {
        fileWriter.write(book.toString() + "\n");
      }
    } catch (IOException e) {
      System.out.println("Unable to write file");
    }

    // chiudo lo scanner di tastiera
    keyboardReader.close();
  }


  // metodo che legge il file
  private static void readFile() {
    // leggo il file
    File file = new File("./resources/books.txt");
    if (file.exists()) {
      System.out.println("LEGGO IL FILE");
      try (Scanner fileReader = new Scanner(file)) {
        while (fileReader.hasNextLine()) {
          String line = fileReader.nextLine();
          System.out.println(line);
        }
      } catch (FileNotFoundException e) {
        System.out.println("Unable to read file");
      }
    } else {
      System.out.println("There is not a file yet");
    }
  }
}
