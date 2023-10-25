package org.learning.java.abstraction.animals;

public abstract class Animal {

  // ATTRIBUTI
  private String name;

  // COSTRUTTORI
  public Animal(String name) {
    this.name = name;
  }

  //METODI
  public String getName() {
    return name;
  }

  public void sleep() {
    System.out.println("Zzzzzzz");
  }

  public void eat(String what) {
    System.out.println("I'm eating " + what);
  }

  // metodo astratto perchè non so come implementarlo nella generica classe Animal
  public abstract void makeNoise();
}
