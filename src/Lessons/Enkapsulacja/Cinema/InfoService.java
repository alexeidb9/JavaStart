package Lessons.Enkapsulacja.Cinema;

public class InfoService {

        public void provideSessionInfo(Ticket ticket, MovieSession movie) {
                System.out.println("Sprzedane bilety");
                int ticketId = ticket.getTicket1Id();
                String ticketPersonData = ticket.getTicket1PersonData();
                String ticketMovieTitle = movie.getMovieTitle();
                String movieType = movie.getMovieType();
                int movieTime = movie.getMovieTime();
                int freeSeats = movie.getFreeSeats();
                int maxSeats = movie.getMaxSeats();

                if (ticketId != 0) {
                        System.out.println(ticketId + " | " + ticketPersonData + " | " + ticketMovieTitle + " - " + movieType + " - " + movieTime + "min");
                        System.out.println("Liczba pozostałych miejsc: " + freeSeats);
                        System.out.println("Liczba sprzedanych biletów: " + (maxSeats - freeSeats));
                }
        }


}
