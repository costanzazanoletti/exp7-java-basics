package org.learning.java.fundamentals;

import java.util.Scanner;

public class OSSurvey {

  /*
  sondaggio sui sistemi operativi della classe: Windows, Linux, Mac
  Dichiaro quanti utenti hanno un certo SO
  Calcolo la percentuale
  * */
  public static void main(String[] args) {
    // istanzio una variabile Scanner per leggere l'input da tastiera
    Scanner keyboardInput = new Scanner(System.in);
    // variabili che rappresentano il numero di utenti per SO
    int winUsers;
    int macUsers;
    int linuxUsers;

    // creo un menu testuale
    System.out.println("Number of Windows users: ");
    winUsers = keyboardInput.nextInt();
    System.out.println("Number of Mac users: ");
    macUsers = keyboardInput.nextInt();
    System.out.println("Number of Linux users: ");
    linuxUsers = keyboardInput.nextInt();

    // calcolo il totale
    int totalUsers = winUsers + macUsers + linuxUsers; // 25.0

    // calcolo per ciascun SO la percentuale numero/totale*100
    double winPerc = winUsers / (double) totalUsers * 100; // exp=80
    double macPerc = macUsers / (double) totalUsers * 100; // exp=16
    double linuxPerc = linuxUsers / (double) totalUsers * 100; // exp=4

    // stampo a video le percentuali
    System.out.println("Windows: " + winPerc + "%");
    System.out.println("Mac: " + macPerc + "%");
    System.out.println("Linux: " + linuxPerc + "%");
    System.out.println("Total users: " + totalUsers);

    // chiudo lo scanner
    keyboardInput.close();

  }
}
