package Lessons.Enkapsulacja.system;

import Lessons.Enkapsulacja.model.Client;
import Lessons.Enkapsulacja.model.MovieShow;
import Lessons.Enkapsulacja.model.Ticket;

public class CinemaSystem {

    public static void main(String[] args) {

        Client client1 = new Client("Jan", "Kowalski", 17);
        Client client2 = new Client("Anna", "Zalewska", 19);

        MovieShow movie1 = new MovieShow("Omen","Horror",128,16,72,72);

        TicketSystem ticketSystem = new TicketSystem();

        Ticket ticket1 = ticketSystem.createTicket(movie1,client1);
        Ticket ticket2 = ticketSystem.createTicket(movie1,client2);

        System.out.println("Sprzedane bilety:");
        if (ticket1 != null) {
            System.out.println(ticket1.getInfo());
        }
        if (ticket2 != null) {
            System.out.println(ticket2.getInfo());
        }

        System.out.println("Liczba pozostałych miejsc: " + movie1.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));

    }

}
