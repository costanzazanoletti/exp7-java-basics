package org.learning.java.fundamentals;

import java.util.Arrays;

public class ArrayExample {

  public static void main(String[] args) {
    int[] numbers;

    numbers = new int[10];
    // per stampare un array posso usare un metodo della classe di utility Arrays
    System.out.println(Arrays.toString(numbers));
    // posso assegnare valore a una posizione presa per indice
    numbers[0] = 100;
    numbers[1] = 77;
    numbers[9] = 333;

    // posso leggere il  valore a una posizione presa per indice
    System.out.println(numbers[0]);
    // posso modificare una posizione presa per indice
    numbers[0] = 20;

    System.out.println(Arrays.toString(numbers));

    String[] weekDays = {"mon", "tue", "wen", "thu", "fri", "sat", "sun"};
    System.out.println(Arrays.toString(weekDays));

  }
}
