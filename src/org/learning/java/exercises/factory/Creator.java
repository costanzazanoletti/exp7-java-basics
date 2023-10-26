package org.learning.java.exercises.factory;

public class Creator {

  public Player create(String type) throws IllegalArgumentException {
// type può essere o dvd player o playstation
    switch (type) {
      case "dvd player":
        return new DvdPlayer();
      case "playstation":
        return new Playstation();
      case "switch":
        return new NintendoSwitch();
      default:
        throw new IllegalArgumentException("Invalid type");
    }
  }
}
