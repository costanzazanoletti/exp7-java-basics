package org.learning.java.abstraction.animals;

public class Cow extends Animal {

  public Cow(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Mooooooh");
  }
}
