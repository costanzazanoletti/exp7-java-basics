package org.learning.java.abstraction.animals;

public class Fish extends Animal implements CanSwim {

  public Fish(String name) {
    super(name);
  }

  // override del metodo makeNoise() della classe Animal
  @Override
  public void makeNoise() {
    System.out.println("Blub");
  }

  // override del metodo swim() dell'interfaccia CanSwim
  @Override
  public void swim() {
    System.out.println("I'm a fish and I swim");
  }
}
