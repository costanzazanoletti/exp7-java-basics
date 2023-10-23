package org.learning.java.exercises.shop;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Purchase {

  // ATTRIBUTI
  private LocalDate date;
  private int quantity;
  Product product;

  // COSTRUTTORI
  public Purchase(LocalDate date, int quantity, Product product) {
    this.date = date;
    this.quantity = quantity;
    this.product = product;
  }

  // GETTER e SETTER

  public LocalDate getDate() {
    return date;
  }

  public int getQuantity() {
    return quantity;
  }

  public Product getProduct() {
    return product;
  }

  // metodo che calcola il totale dell'acquisto
  public BigDecimal getTotal() {
    BigDecimal singlePrice = product.getFullPrice();
    return singlePrice.multiply(new BigDecimal(quantity));
  }
}
