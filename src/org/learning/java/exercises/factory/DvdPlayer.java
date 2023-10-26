package org.learning.java.exercises.factory;

public class DvdPlayer implements Player {

  @Override
  public void play() {
    System.out.println("I'm a Dvd Player and I'm playing");
  }

  @Override
  public void stop() {
    System.out.println("I'm a Dvd Player and I stop");
  }
}
