package org.learning.java.exercises.events;

import java.util.Scanner;
import org.learning.java.exercises.events.exceptions.EventExpiredException;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("WELCOME TO EVENT MANAGER");
    // inizializzo l'evento a null
    Event event = null;
    // continuo a ciclare fino a che l'evento non sarà stato creato
    while (event == null) {
      System.out.println("Create a new event");
      try {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Date (yyyy-MM-dd): ");
        String dateString = scanner.nextLine();
        System.out.print("Total seats: ");
        int totalSeats = Integer.parseInt(scanner.nextLine());
        // creare un evento
        event = new Event(title, totalSeats, dateString);
        System.out.println("Event created: " + event.toString());

      } catch (NumberFormatException e) {
        System.out.println("Invalid number");
      } catch (IllegalArgumentException e) {
        System.out.println("Unable to create event: " + e.getMessage());
      }
    }
    // flag booleano exit
    boolean exit = false;
    do {
      System.out.println("Booked seats: " + event.getBookedSeats() + "- available seats: "
          + event.getAvailableSeats());
      System.out.println("What operation? 1-book 2-cancel any-exit");
      String choice = scanner.nextLine();
      try {
        switch (choice) {
          // provare a prenotare
          case "1":
            System.out.println("How many seats to book?");
            int numberOfSeatsToBook = Integer.parseInt(scanner.nextLine());
            event.book(numberOfSeatsToBook);
            break;
          // provare a disdire
          case "2":
            System.out.println("How many seats to cancel?");
            int numberOfSeatsToCancel = Integer.parseInt(scanner.nextLine());
            event.cancel(numberOfSeatsToCancel);
            break;
          default:
            // per uscire cambio il valore del flag
            exit = true;
            System.out.println("Bye Bye");
            break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid number");
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      } catch (EventExpiredException e) {
        System.out.println(e.getMessage());
      } catch (IllegalStateException e) {
        System.out.println(e.getMessage());
      }
    } while (!exit);

    scanner.close();
  }
}
