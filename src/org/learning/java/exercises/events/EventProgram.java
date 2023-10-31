package org.learning.java.exercises.events;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EventProgram {

  // ATTRIBUTI
  private String title;
  private List<Event> events;

  // COSTRUTTORE
  public EventProgram(String title) {
    this.title = title;
    this.events = new ArrayList<>();
  }

  // METODI
  // un metodo che aggiunge alla lista un Evento, passato come parametro
  public boolean addEvent(Event event) {
    // se ho già un evento su stessa data e stesso titolo allora non lo aggiunge
    if (!events.contains(event)) {
      events.add(event);
      return true;
    }
    return false;
  }

  // un metodo che restituisce una lista con tutti gli eventi presenti in una certa data
  public List<Event> getEventsPerDate(LocalDate date) {
 /*   List<Event> filteredEvents = new ArrayList<>();
    // filtro gli eventi
    for (Event event : events) {
      if (event.getDate().equals(date)) {
        // se l'evento ha la stessa data lo aggiungo
        filteredEvents.add(event);
      }
    }
    return filteredEvents;*/
    return events.stream().filter(event -> event.getDate().equals(date))
        .collect(Collectors.toList());

  }

  // un metodo che restituisce quanti eventi sono presenti nel programma
  public int getEventsSize() {
    return events.size();
  }

  public void clearEvents() {
    events.clear();
  }

  @Override
  public String toString() {
    // ordino gli eventi
    Collections.sort(events);
    String result = title + "\n";
    for (Event event : events) {
      result += event.toString() + "\n";
    }
    return result;
  }
}
