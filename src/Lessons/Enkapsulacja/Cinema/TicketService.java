package Lessons.Enkapsulacja.Cinema;

public class TicketService {

    Ticket registerTicket (Viewer viewer, MovieSession movie) {

        int age = viewer.getAge();
        int ageGroup = movie.getAgeRequired();
        int sitsAvailability = movie.getFreeSeats();

        if(age >= ageGroup && sitsAvailability != 0) {
            Ticket ticket = new Ticket(viewer.getFirstName() + " " + viewer.getLastName(),movie.getMovieTitle());
            movie.setFreeSeats(movie.getFreeSeats() - 1);
            return ticket;
        } else if (age < ageGroup && sitsAvailability != 0) {
            System.out.println("Film dostępny dla osób powyżej " + ageGroup + " lat");
        } else if (age >= ageGroup && sitsAvailability == 0) {
            System.out.println("Brak wolnych miejsc na seans");
        }

        return null;

}
}
