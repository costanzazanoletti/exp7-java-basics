package org.learning.java.media;

public class Audio extends Media implements Playable, HasVolume {

  // COSTANTI DI CLASSE
  public final static int MIN_VOLUME = 0;
  public final static int MAX_VOLUME = 10;
  public final static int DEFAULT_VOLUME = 5;
  // ATTRIBUTI
  private int volume;

  public Audio(String title) throws IllegalArgumentException {
    super(title);
    this.volume = DEFAULT_VOLUME;
  }

  public int getVolume() {
    return volume;
  }

  @Override
  public void execute() {
    play();
  }

  @Override
  public void play() {
    for (int i = 0; i < volume; i++) {
      System.out.print(getTitle());
    }
    System.out.println();
  }

  @Override
  public void weaker() throws RuntimeException {
    // se non siamo al minimo diminuisco di 1 il volume
    if (volume > MIN_VOLUME) {
      volume--;
    } else {
      throw new RuntimeException("REACHED MIN VOLUME");
    }
  }

  @Override
  public void louder() throws RuntimeException {
    // se non siamo al massimo aumento di 1 il volume
    if (volume < MAX_VOLUME) {
      volume++;
    } else {
      throw new RuntimeException("REACHED MAX VOLUME");
    }
  }

  @Override
  public void printVolume() {
    System.out.println("Current volume: " + volume);
  }
}
