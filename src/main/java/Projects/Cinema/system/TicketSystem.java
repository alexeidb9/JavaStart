package Projects.Cinema.system;

import Projects.Cinema.model.Client;
import Projects.Cinema.model.MovieShow;
import Projects.Cinema.model.Ticket;

public class TicketSystem {

    Ticket createTicket(MovieShow movieShow, Client client) {

        if (movieShow.hasFreeSeats()) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (client.getAge() < movieShow.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movieShow.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = movieShow.getMaxSeats() - movieShow.getFreeSeats() + 1;
            movieShow.decreaseFreeSeatsNumberByOne();
            return new Ticket(ticketId, movieShow,client);
        }

}


}
