package org.learning.java.abstraction.animals;

public class Duck extends Animal implements CanFly, CanSwim {

  public Duck(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Quack");
  }

  @Override
  public void fly() {
    System.out.println("I'm a duck and I fly");
  }

  @Override
  public void swim() {
    System.out.println("I'm a duck and I swim");
  }
}
