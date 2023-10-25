package org.learning.java.abstraction.geometry;

public class Triangle implements Polygon {

  private double side1;
  private double side2;
  private double side3;
  private double height;

  public Triangle(double side1, double side2, double side3, double height) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.height = height;
  }

  @Override
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  @Override
  public double getArea() {
    return side1 * height / 2;
  }
}
