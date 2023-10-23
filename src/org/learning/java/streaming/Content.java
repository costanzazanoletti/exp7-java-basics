package org.learning.java.streaming;

public class Content {

  // ATTRIBUTI
  private String title;

  // COSTRUTTORI
  public Content(String title) {
    this.title = title;
  }

  // METODI

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void play() {
    System.out.println("Playing..." + title);
  }

  @Override
  public String toString() {
    return "Title: " + title;
  }
}
