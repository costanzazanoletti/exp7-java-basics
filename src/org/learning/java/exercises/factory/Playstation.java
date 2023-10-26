package org.learning.java.exercises.factory;

public class Playstation implements Player {

  @Override
  public void play() {
    System.out.println("I'm a Playstation and I'm playing");
  }

  @Override
  public void stop() {
    System.out.println("I'm a Playstation and I stop");
  }
}
