package org.learning.java.streaming;

public class Short extends Movie {

  public Short(String title) {
    // gli short durano tutti 15 minuti
    super(title, 15);
  }

  @Override
  public void play() {
    super.play();
  }
}
