package org.learning.java.collections.billionaire;

public class Person {

  private String name;
  private int billions;

  private Address address;

  public Person(String name, int billions) {
    this.name = name;
    this.billions = billions;
  }

  public Person() {

  }

  public String getName() {
    return name;
  }

  public int getBillions() {
    return billions;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
    //return new Address(address.getAddress(), address.getCity());
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void setBillions(int billions) {
    this.billions = billions;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", billions=" + billions +
        ", address=" + address +
        '}';
  }


}
