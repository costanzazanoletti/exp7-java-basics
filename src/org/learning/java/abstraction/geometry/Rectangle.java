package org.learning.java.abstraction.geometry;

public class Rectangle implements Polygon {

  private double side1;

  private double side2;

  public Rectangle(double base, double height) {
    this.side1 = base;
    this.side2 = height;
  }

  @Override
  public double getPerimeter() {
    return 2 * side1 + 2 * side2;
  }

  @Override
  public double getArea() {
    return side1 * side2;
  }
}
