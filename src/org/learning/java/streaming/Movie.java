package org.learning.java.streaming;

import org.learning.java.oop.geometry.Rectangle;

public class Movie extends Content {

  private long duration;

  // devo avere un costruttore che permette di chiamare il costruttore della superclasse
  public Movie(String title, long duration) {
    // il title lo passo al costruttore di Content
    super(title);
    // la duration la uso per valorizzare il mio attributo duration
    this.duration = duration;
  }

  public void setDuration(long duration) {
    this.duration = duration;
  }


  @Override
  public void play() {
    System.out.println("Playing... " + getTitle() + " for " + duration + " minutes");
  }

  @Override
  public String toString() {
    return "Title: " + getTitle() + ", " + "Duration: " + duration;
  }
}
