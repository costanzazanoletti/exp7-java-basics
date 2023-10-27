package org.learning.java.exercises.wishlist;

import java.util.Objects;

public class Present implements Comparable<Present> {

  // ATTRIBUTI
  private String description;
  private String person;

  // COSTRUTTORI

  public Present(String description, String person) {
    this.description = description;
    this.person = person;
  }

  // GETTER E SETTER

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPerson() {
    return person;
  }

  public void setPerson(String person) {
    this.person = person;
  }

  // METODI


  @Override
  public String toString() {
    return "Present{" +
        "description='" + description + '\'' +
        ", person='" + person + '\'' +
        '}';
  }

  /*@Override
  public boolean equals(Object obj) {
    // verifico se sono lo stesso oggetto
    if (this == obj) {
      return true;
    }

    // verifico se appartengono alla stessa classe
    if (obj instanceof Present) {
      Present otherPresent = (Present) obj;
      // confronto campo per campo
      return this.getDescription().equals(otherPresent.getDescription()) && this.getPerson()
          .equals(otherPresent.getPerson());
    } else {
      // se non appartengono alla stessa classe sono sicuramente non uguali
      return false;
    }

  }*/

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Present present = (Present) o;

    if (getDescription() != null ? !getDescription().equals(present.getDescription())
        : present.getDescription() != null) {
      return false;
    }
    return getPerson() != null ? getPerson().equals(present.getPerson())
        : present.getPerson() == null;
  }

  @Override
  public int hashCode() {
    int result = getDescription() != null ? getDescription().hashCode() : 0;
    result = 31 * result + (getPerson() != null ? getPerson().hashCode() : 0);
    return result;
  }

  @Override
  public int compareTo(Present otherPresent) {
    // questo metodo deve restituire 0 se i due oggetti sono uguali
    // deve restituire un valore > 0 (1)se this è > dell'altro
    // deve restituire un valore < 0 (-1)se this è < dell'altro
    String myValues = description + person;
    String otherValues = otherPresent.getDescription() + otherPresent.getPerson();
    return myValues.compareTo(otherValues);
  }
}
