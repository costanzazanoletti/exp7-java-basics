package org.learning.java.abstraction.animals;

public class Balloon implements CanFly {

  @Override
  public void fly() {
    System.out.println("I'm a balloon and I fly");
  }

  public void pop() {
    System.out.println("POP");
  }
}
