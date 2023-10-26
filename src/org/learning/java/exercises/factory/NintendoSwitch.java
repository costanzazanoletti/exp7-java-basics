package org.learning.java.exercises.factory;

public class NintendoSwitch implements Player {

  @Override
  public void play() {
    System.out.println("I'm a Nintendo Switch and I'm playing");
  }

  @Override
  public void stop() {
    System.out.println("I'm a Nintendo Switch and I stop");
  }
}
