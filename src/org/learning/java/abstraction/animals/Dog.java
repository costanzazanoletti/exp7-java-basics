package org.learning.java.abstraction.animals;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Woof");
  }
}
