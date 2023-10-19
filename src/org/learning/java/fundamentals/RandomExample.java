package org.learning.java.fundamentals;

import java.util.Random;

public class RandomExample {

  public static void main(String[] args) {
    // creo una variabile con una istanza di un generatore di numeri random
    Random randomGenerator = new Random();

    int randomNumber = randomGenerator.nextInt(0, 11); // origin compreso, bound escluso
    System.out.println("Random number: " + randomNumber);
  }
}
