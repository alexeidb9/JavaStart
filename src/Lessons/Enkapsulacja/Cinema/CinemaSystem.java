package Lessons.Enkapsulacja.Cinema;

public class CinemaSystem {

    public static void main(String[] args) {

        Viewer viewer1 = new Viewer("Jan", "Kowalski", 17);
        Viewer viewer2 = new Viewer("Anna", "Zalewska", 19);

        MovieSession movie1 = new MovieSession("Omen","Horror",128,16,72,72);

        TicketService ticketService = new TicketService();
        System.out.println(ticketService.registerTicket(viewer1, movie1).getTicket1Id());
        System.out.println(ticketService.registerTicket(viewer1, movie1).getTicket1PersonData());
        System.out.println(ticketService.registerTicket(viewer1, movie1).getTicket1MovieTitle());

        System.out.println(ticketService.registerTicket(viewer2, movie1).getTicket1Id());
        System.out.println(ticketService.registerTicket(viewer2, movie1).getTicket1PersonData());
        System.out.println(ticketService.registerTicket(viewer2, movie1).getTicket1MovieTitle());

        InfoService infoService = new InfoService();

        infoService.provideSessionInfo(ticketService.registerTicket(viewer1, movie1), movie1);


    }

}
