package org.learning.java.exercises.library.exceptions;

public class InvalidBookParameterException extends RuntimeException {

  public InvalidBookParameterException(String message) {
    super(message);
  }
}
