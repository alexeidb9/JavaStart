package Lessons.Enkapsulacja.Cinema;

import java.util.Random;

public class Ticket {
    private int ticket1Id;
    private String ticket1PersonData;
    private String ticket1MovieTitle;

    private Random rn = new Random();

    public Ticket(String ticket1PersonData, String ticket1MovieTitle) {
        this.ticket1Id = rn.nextInt(999999);
        this.ticket1PersonData = ticket1PersonData;
        this.ticket1MovieTitle = ticket1MovieTitle;
    }


    public int getTicket1Id() {
        return ticket1Id;
    }

    public void setTicket1Id(int ticket1Id) {
        this.ticket1Id = ticket1Id;
    }

    public String getTicket1PersonData() {
        return ticket1PersonData;
    }

    public void setTicket1PersonData(String ticket1PersonData) {
        this.ticket1PersonData = ticket1PersonData;
    }

    public String getTicket1MovieTitle() {
        return ticket1MovieTitle;
    }

    public void setTicket1MovieTitle(String ticket1MovieTitle) {
        this.ticket1MovieTitle = ticket1MovieTitle;
    }

    public Random getRn() {
        return rn;
    }

    public void setRn(Random rn) {
        this.rn = rn;
    }

    void soldTickets () {

    }
}
