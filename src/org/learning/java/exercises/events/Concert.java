package org.learning.java.exercises.events;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concert extends Event {

  // ATTRIBUTI
  private LocalTime time;
  private BigDecimal price;

  // COSTRUTTORE
  public Concert(String title, LocalDate date, int totalSeats, LocalTime time,
      BigDecimal price) throws IllegalArgumentException {
    super(title, date, totalSeats);
    this.time = time;
    this.price = price;
  }

  // GETTER E SETTER
  public LocalTime getTime() {
    return time;
  }

  public void setTime(LocalTime time) {
    this.time = time;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  // METODI
  public String getFormattedDateTime() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    return getDate().format(formatter) + " at " + time;
  }

  public String getFormattedPrice() {
    DecimalFormat formatter = new DecimalFormat("#,###.00");
    return formatter.format(price) + "€";
  }

  @Override
  public String toString() {
    return getFormattedDateTime() + "-" + getTitle() + "-" + getFormattedPrice();
  }
}
