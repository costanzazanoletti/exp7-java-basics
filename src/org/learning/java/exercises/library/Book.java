package org.learning.java.exercises.library;

import org.learning.java.exercises.library.exceptions.InvalidBookParameterException;

public class Book {

  // ATTRIBUTI
  private String title;
  private String authors;
  private String publisher;
  private int numberOfPages;

  // COSTRUTTORI

  public Book(String title, String authors, String publisher, int numberOfPages)
      throws InvalidBookParameterException {
    // prima valido gli input
    checkValidString(title, "title");
    checkValidString(authors, "authors");
    checkValidString(publisher, "publisher");
    checkPositiveNumber(numberOfPages, "number of pages");
    // se gli input sono validi proseguo col costruttore
    this.title = title;
    this.authors = authors;
    this.publisher = publisher;
    this.numberOfPages = numberOfPages;
  }

  // GETTER E SETTER

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) throws InvalidBookParameterException {
    checkValidString(title, "title");
    this.title = title;
  }

  public String getAuthors() {
    return authors;
  }

  public void setAuthors(String authors) throws InvalidBookParameterException {
    checkValidString(authors, "authors");
    this.authors = authors;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) throws InvalidBookParameterException {
    checkValidString(publisher, "publisher");
    this.publisher = publisher;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(int numberOfPages) throws InvalidBookParameterException {
    checkPositiveNumber(numberOfPages, "number of pages");
    this.numberOfPages = numberOfPages;
  }

  // METODI
  private void checkValidString(String inputString, String inputName)
      throws InvalidBookParameterException {
    if (inputString == null || inputString.isBlank()) {
      throw new InvalidBookParameterException(inputName + " null or blank");
    }
    if (inputString.length() > 255) {
      throw new InvalidBookParameterException(inputName + "too long (max 255)");
    }
  }

  private void checkPositiveNumber(int number, String inputName)
      throws InvalidBookParameterException {
    if (number <= 0) {
      throw new InvalidBookParameterException(inputName + " <= 0");
    }
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", authors='" + authors + '\'' +
        ", publisher='" + publisher + '\'' +
        ", numberOfPages=" + numberOfPages +
        '}';
  }
}
