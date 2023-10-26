package org.learning.java.collections.billionaire;

public class Address {

  private String address;
  private String city;

  public Address(String address, String city) {
    this.address = address;
    this.city = city;
  }

  public String getAddress() {
    return address;
  }

  public String getCity() {
    return city;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "Address{" +
        "address='" + address + '\'' +
        ", city='" + city + '\'' +
        '}';
  }
}
