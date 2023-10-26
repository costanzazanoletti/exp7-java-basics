package org.learning.java.collections.billionaire;

public class TestAddress {

  public static void main(String[] args) {
    Person paperone = new Person("Paperone", 1000);
    paperone.setAddress(new Address("viale dei ciliegi", "Paperopoli"));
    System.out.println(paperone);

    Address address = paperone.getAddress();
    address.setAddress("via delle comete");

    System.out.println(paperone);
  }
}
