package org.learning.java.oop.geometry;

public class Circle {

  // Costante di classe
  public final static double PI = 3.14;

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * PI;
  }
}
