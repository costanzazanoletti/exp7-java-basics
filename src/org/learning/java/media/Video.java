package org.learning.java.media;

public class Video extends Audio implements HasBrightness {

  public final static double MIN_BRIGHTNESS = 0.0;
  public final static double MAX_BRIGHTNESS = 0.9;
  public final static double DEFAULT_BRIGHTNESS = 0.5;
  private double brightness;

  public Video(String title) throws IllegalArgumentException {
    super(title);
    brightness = DEFAULT_BRIGHTNESS;
  }

  @Override
  public void darker() throws RuntimeException {
    if (brightness > MIN_BRIGHTNESS) {
      brightness -= 0.1;
    } else {
      throw new RuntimeException("REACHED MIN BRIGHTNESS");
    }
  }

  @Override
  public void brighter() throws RuntimeException {
    if (brightness < MAX_BRIGHTNESS) {
      brightness += 0.1;
    } else {
      throw new RuntimeException("REACHED MAX BRIGHTNESS");
    }
  }

  @Override
  public void printBrightness() {
    System.out.println("Current brightness: " + brightness);
  }

  @Override
  public void play() {
    String s = getTitle() + "*".repeat((int) brightness * 10);
    System.out.println(s.repeat(getVolume()));
  }
}
