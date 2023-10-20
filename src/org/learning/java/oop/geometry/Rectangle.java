package org.learning.java.oop.geometry;

public class Rectangle {

  // ATTRIBUTI
  private int base;
  private int height;

  // COSTRUTTORI
  public Rectangle() {
    base = 1;
    height = 1;
  }

  public Rectangle(int base, int height) {
    // controllo il valore di base e altezza
    // se non è valido gli do il default
    /*if (base <= 0) {
      base = 1;
    }
    if (height <= 0) {
      height = 1;
    }*/

    this.base = ifInvalidDefault(base);
    this.height = ifInvalidDefault(height);
  }

  // METODI
  // - come si chiama
  // - che tipo di dato restituisce
  // - se ha bisogno di parametri dall'esterno e quali

  // GETTER E SETTER
  public int getBase() {
    return base;
  }

  public int getHeight() {
    return height;
  }

  // metodo che calcola il perimetro del rettangolo
  public int getPerimeter() {
    return base * 2 + height * 2;
  }

  // metodo che calcola l'area del rettangolo
  public int getArea() {
    return base * height;
  }

  // metodo per allungare la base di una certa quantità
  public void increaseBase(int amount) {
    base += amount;
  }

  // metodo per allungare l'altezza di una certa quantità
  public void increaseHeight(int amount) {
    height += amount;
  }

  // METODI DI SERVIZIO
  private int ifInvalidDefault(int value) {
    if (value <= 0) {
      return 1;
    } else {
      return value;
    }
  }


}
