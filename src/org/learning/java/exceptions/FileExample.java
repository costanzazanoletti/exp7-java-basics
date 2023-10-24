package org.learning.java.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

  public static void main(String[] args) {
    File workingDir = new File(".");
    System.out.println(workingDir.exists());
    if (workingDir.exists() && workingDir.isDirectory()) {
      String[] files = workingDir.list();
      for (String name : files) {
        System.out.println(name);
      }
    }

    // inizializzo a null il FileWriter
    FileWriter fileWriter = null;
    try {
      // provo ad aprirlo
      fileWriter = new FileWriter("./resources/data.txt");
      // provo a scriverci sopra
      fileWriter.write("Ciao\n");
      fileWriter.write("Arrivederci");

    } catch (IOException e) { // se si solleva un'eccezione passo dal catch
      System.out.println("Unable to write file");
    } finally {
      // sia che ho terminato il try, sia che sono entrato nel catch passo di qui
      try {
        if (fileWriter != null) {
          System.out.println("Chiudo il file");
          fileWriter.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    // Provo a leggere il file
    Scanner fileReader = null;
    try {
      fileReader = new Scanner(new File("./resources/data.txt"));
      while (fileReader.hasNextLine()) {
        String line = fileReader.nextLine();
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } finally {
      if (fileReader != null) {
        fileReader.close();
      }
    }
  }
}
