package org.learning.java.media;

public abstract class Media {

  // ATTRIBUTI
  private String title;

  // COSTRUTTORE
  public Media(String title) throws IllegalArgumentException {
    if (title == null || title.isBlank()) {
      throw new IllegalArgumentException("Title null or blank");
    }
    this.title = title;
  }
  // GETTER

  public String getTitle() {
    return title;
  }

  public abstract void execute();
}
