package main.Auction;

public class Main {

    public static void main(String[] args) {

        Auction auction1 = new Auction();
        auction1.description = "Konsola dla wymagających graczy";
        auction1.title = "XBox One";
        auction1.price = 999.9;
        auction1.seller = new User();
        auction1.seller.firstName = "Jan";
        auction1.seller.lastName = "Kowalski";
        auction1.seller.adress = new Adress();
        auction1.seller.adress.city = "Wroclaw";
        auction1.seller.adress.postalCode = "50-500";
        auction1.seller.adress.street = "Kościuszki";
        auction1.seller.adress.homeNo = "24A";
        auction1.seller.adress.flatNo = 21;

        Auction auction2 = new Auction();
        auction2.description = "Samsung S23";
        auction2.title = "Niesamowity telefon z trzema objetywami";
        auction2.price = 3999;
        auction2.seller = new User();
        auction2.seller.firstName = "Justyna";
        auction2.seller.lastName = "Adamczyck";
        auction2.seller.adress = auction1.seller.adress;


        System.out.println(auction1.title + " " + auction1.description);
        System.out.println(auction1.price);
        System.out.println("Sprzedawca: " + auction1.seller.firstName + " " + auction1.seller.lastName);
        System.out.println("\n");
        System.out.println(auction2.title + " " + auction2.description);
        System.out.println(auction2.price);
        System.out.println("Sprzedawca: " + auction2.seller.firstName + " " + auction2.seller.lastName);




    }

}
