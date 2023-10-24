package org.learning.java.exceptions;

public class Rectangle {

  private int base;
  private int height;

  public Rectangle(int base, int height) throws IllegalArgumentException {
    // verifico che base e altezza non siano <=0
    if (base <= 0 || height <= 0) {
      throw new IllegalArgumentException("base or height <= 0");
    }
    this.base = base;
    this.height = height;
  }

  public int getBase() {
    return base;
  }

  public void setBase(int base) {
    this.base = base;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "base=" + base +
        ", height=" + height +
        '}';
  }
}
