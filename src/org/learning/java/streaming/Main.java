package org.learning.java.streaming;

public class Main {

  public static void main(String[] args) {
    Content content = new Content("Generic content");
    //content.setTitle("Generic content");
    content.play();

    Movie oppenheimer = new Movie("Oppenheimer", 280);
    //oppenheimer.setTitle("Oppenheimer");
    // oppenheimer.setDuration(280);
    oppenheimer.play();

    Movie barbie = new Movie("Barbie", 220);

    Short commercial = new Short("Commercial");

    System.out.println(content);
    System.out.println(oppenheimer);
    System.out.println(barbie);
    System.out.println(commercial);

  }
}
