package org.learning.java.media;

public class Image extends Media implements HasBrightness {

  public final static int MAX_BRIGHTNESS = 100;
  public final static int MIN_BRIGHTNESS = 0;
  public final static int DEFAULT_BRIGHTNESS = 50;

  private int brightness;

  public Image(String title) throws IllegalArgumentException {
    super(title);
    this.brightness = DEFAULT_BRIGHTNESS;
  }

  private void show() {
    System.out.println(getTitle() + "*".repeat(brightness));
  }

  @Override
  public void darker() throws RuntimeException {
    if (brightness > MIN_BRIGHTNESS) {
      brightness--;
    } else {
      throw new RuntimeException("REACHED MIN BRIGHTNESS");
    }
  }

  @Override
  public void brighter() throws RuntimeException {
    if (brightness < MAX_BRIGHTNESS) {
      brightness++;
    } else {
      throw new RuntimeException("REACHED MIN BRIGHTNESS");
    }
  }

  @Override
  public void printBrightness() {
    System.out.println("Current brightness: " + brightness);
  }

  @Override
  public void execute() {
    show();
  }

}
