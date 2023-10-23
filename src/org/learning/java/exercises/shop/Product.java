package org.learning.java.exercises.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

  // ATTRIBUTI
  private int code;
  private String name;
  private String description;
  private BigDecimal price;
  private BigDecimal vat;

  // contatore
  private static int counter = 0;

  // COSTRUTTORI

  public Product(String name, String description, BigDecimal price, BigDecimal vat) {
    // questi attributi li valorizzo col valore passato come parametro
    this.name = name;
    this.description = description;
    this.price = price;
    this.vat = vat;
    // ogni volta che si istanzia un prodotto il contatore aumenta di 1
    counter++;
    // il codice lo valorizzo con un numero random
    this.code = counter;
  }

  // GETTER e SETTER


  public int getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public BigDecimal getVat() {
    return vat;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public void setVat(BigDecimal vat) {
    this.vat = vat;
  }

  // METODI

  // metodo che restituisce il prezzo comprensivo di iva
  public BigDecimal getFullPrice() {
    // prezzo base + prezzo base * iva
    return price.add(price.multiply(vat)).setScale(2, RoundingMode.HALF_EVEN);

  }

  public String getFullName() {
    return code + "-" + name;
  }

  // metodo che serve a generare un codice per il prodotto
  private int generateCode() {
    Random random = new Random();
    return random.nextInt(1, 100000000);
  }

  private String getPaddedCode() {
    String codeString = Integer.toString(code);
    while (codeString.length() < 8) {
      codeString = "0" + codeString;
    }
    return codeString;
  }
}
