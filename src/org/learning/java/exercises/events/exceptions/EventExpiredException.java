package org.learning.java.exercises.events.exceptions;

public class EventExpiredException extends IllegalStateException {

  public EventExpiredException(String s) {
    super(s);
  }
}
