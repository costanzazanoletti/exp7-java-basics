package org.learning.java.abstraction.animals;

public class Butterfly extends Animal implements CanFly {

  public Butterfly(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Frrr");
  }

  @Override
  public void fly() {
    System.out.println("I'm a butterfly and I fly");
    for (int i = 0; i < MAX_FLYING_TIME; i++) {
      System.out.println("+");
    }
  }
}
