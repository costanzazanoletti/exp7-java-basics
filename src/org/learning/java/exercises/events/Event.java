package org.learning.java.exercises.events;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import org.learning.java.exercises.events.exceptions.EventExpiredException;

public class Event implements Comparable<Event> {

  // ATTRIBUTI
  private String title;
  private LocalDate date; // non nel passato
  private int totalSeats; // non 0 o negativo
  private int bookedSeats;

  // COSTRUTTORI
  public Event(String title, LocalDate date, int totalSeats) throws IllegalArgumentException {
    // prima di procedere col costruttore faccio le validazioni
    validateDate(date);
    validateTotalSeats(totalSeats);
    this.title = title;
    this.date = date;
    this.totalSeats = totalSeats;
    this.bookedSeats = 0;
  }

  public Event(String title, int totalSeats, String dateString) throws IllegalArgumentException {
    try {
      // converto la stringa in data
      LocalDate date = LocalDate.parse(dateString);
      validateDate(date);
      validateTotalSeats(totalSeats);
      this.title = title;
      this.date = date;
      this.totalSeats = totalSeats;
      this.bookedSeats = 0;
    } catch (DateTimeParseException e) {
      throw new IllegalArgumentException("Illegal date format " + e.getMessage());
    } catch (IllegalArgumentException e) {
      throw e;
    }
  }

  // GETTER E SETTER
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) throws IllegalArgumentException {
    validateDate(date);
    this.date = date;
  }

  public int getTotalSeats() {
    return totalSeats;
  }

  public int getBookedSeats() {
    return bookedSeats;
  }

  // METODI
  // metodo che calcola quanti posti sono ancora disponibili
  public int getAvailableSeats() {
    return totalSeats - bookedSeats;
  }

  // metodo per prenotare
  public void book(int numberOfSeats)
      throws IllegalArgumentException, IllegalStateException, EventExpiredException {
    // valido se il numero di posti è positivo
    validateNumberOfSeats(numberOfSeats);
    // valido se ho ancora posti disponibili
    if (getAvailableSeats() < numberOfSeats) {
      throw new IllegalStateException("non enough available seats");
    }
    // valido se l'evento non è passato
    validateEventExpired();
    bookedSeats += numberOfSeats;
  }


  // metodo per disdire
  public void cancel(int numberOfSeats)
      throws IllegalArgumentException, IllegalStateException, EventExpiredException {
    // valido se il numero di posti è positivo
    validateNumberOfSeats(numberOfSeats);
    // valido se ho posti da disdire
    if (bookedSeats < numberOfSeats) {
      throw new IllegalStateException("not enough booked seats");
    }
    // valdio se l'evento non è passato
    validateEventExpired();
    bookedSeats -= numberOfSeats;
  }

  // metodi private per le validazioni
  private static void validateDate(LocalDate date) throws IllegalArgumentException {
    if (date == null || date.isBefore(LocalDate.now())) {
      throw new IllegalArgumentException("invalid date");
    }
  }

  private static void validateTotalSeats(int totalSeats) throws IllegalArgumentException {
    if (totalSeats <= 0) {
      throw new IllegalArgumentException("total seats 0 or negative");
    }
  }

  private static void validateNumberOfSeats(int numberOfSeats) {
    if (numberOfSeats <= 0) {
      throw new IllegalArgumentException("number of seats must be positive");
    }
  }

  private void validateEventExpired() {
    if (date.isBefore(LocalDate.now())) {
      throw new EventExpiredException("event date " + getDate());
    }
  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.UK);
    return date.format(formatter) + " - " + title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Event event = (Event) o;

    if (getTitle() != null ? !getTitle().equals(event.getTitle()) : event.getTitle() != null) {
      return false;
    }
    return getDate().equals(event.getDate());
  }

  @Override
  public int hashCode() {
    int result = getTitle() != null ? getTitle().hashCode() : 0;
    result = 31 * result + getDate().hashCode();
    return result;
  }

  @Override
  public int compareTo(Event eventToCompare) {
    // se le date sono uguali confronto i titoli
    if (date.equals(eventToCompare.getDate())) {
      return title.compareTo(eventToCompare.getTitle());
    }
    // altrimenti confronto le date
    return date.compareTo(eventToCompare.getDate());
  }
}
