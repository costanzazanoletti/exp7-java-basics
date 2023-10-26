package org.learning.java.exercises.factory;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    String type = System.getenv("DEVICE_TYPE");
    System.out.println("Device Type from environment variable: " + type);

    Scanner scanner = new Scanner(System.in);
    Creator creator = new Creator();
    //System.out.println("Which player?");
    // String choice = scanner.nextLine();
    try {
      Player player = creator.create(type);
      player.play();
      player.stop();

    } catch (IllegalArgumentException e) {
      System.out.println("Invalid type of player");
    }

    scanner.close();
  }
}
