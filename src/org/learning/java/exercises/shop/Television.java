package org.learning.java.exercises.shop;

import java.math.BigDecimal;

public class Television extends Product {

  // ATTRIBUTI
  private int dimensions;
  private boolean smart;

  // COSTRUTTORI

  public Television(String name, String description, BigDecimal price,
      BigDecimal vat, int dimensions, boolean smart) {
    super(name, description, price, vat);
    this.dimensions = dimensions;
    this.smart = smart;
  }

  // METODI

  public int getDimensions() {
    return dimensions;
  }

  public void setDimensions(int dimensions) {
    this.dimensions = dimensions;
  }

  public boolean isSmart() {
    return smart;
  }

  public void setSmart(boolean smart) {
    this.smart = smart;
  }

  @Override
  public String toString() {
    return "Television{" +
        "code=" + getCode() +
        ", name='" + getName() + '\'' +
        ", description='" + getDescription() + '\'' +
        ", price=" + getPrice() +
        ", vat=" + getVat() +
        "dimensions=" + dimensions +
        ", smart=" + smart +
        "} ";
  }
}
