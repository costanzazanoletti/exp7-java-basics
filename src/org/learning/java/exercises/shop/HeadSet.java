package org.learning.java.exercises.shop;

import java.math.BigDecimal;

public class HeadSet extends Product {

  // ATTRIBUTI
  private String color;
  private boolean wireless;

  // COSTRUTTORI

  public HeadSet(String name, String description, BigDecimal price,
      BigDecimal vat, String color, boolean wireless) {
    super(name, description, price, vat);
    this.color = color;
    this.wireless = wireless;
  }

  // METODI

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isWireless() {
    return wireless;
  }

  public void setWireless(boolean wireless) {
    this.wireless = wireless;
  }

  @Override
  public String toString() {
    return "HeadSet{" +
        "code=" + getCode() +
        ", name='" + getName() + '\'' +
        ", description='" + getDescription() + '\'' +
        ", price=" + getPrice() +
        ", vat=" + getVat() +
        "color='" + color + '\'' +
        ", wireless=" + wireless +
        "} ";
  }
}
