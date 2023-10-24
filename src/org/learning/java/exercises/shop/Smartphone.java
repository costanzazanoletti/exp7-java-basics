package org.learning.java.exercises.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {

  // ATTRIBUTI
  private String imei;
  private int memory;


  // COSTRUTTORE
  public Smartphone(String name, String description, BigDecimal price,
      BigDecimal vat, String imei, int memory) {
    // per prima cosa chiamo il costruttore di Product
    super(name, description, price, vat);
    // assegno il valore ai miei attributi
    this.imei = imei;
    this.memory = memory;
  }

  // METODI

  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public int getMemory() {
    return memory;
  }

  public void setMemory(int memory) {
    this.memory = memory;
  }

  @Override
  public String toString() {
    return "Smartphone{" +
        "code=" + getCode() +
        ", name='" + getName() + '\'' +
        ", description='" + getDescription() + '\'' +
        ", price=" + getPrice() +
        ", vat=" + getVat() +
        "imei='" + imei + '\'' +
        ", memory=" + memory +
        "} ";
  }
}
