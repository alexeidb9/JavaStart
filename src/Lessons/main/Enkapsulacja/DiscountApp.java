package Lessons.main.Enkapsulacja;

public class DiscountApp {

    public static void main(String[] args) {

//        String firstName = "Jan";
//        String lastName = "Kowalski";
//        boolean clientPremium = true;
//        double price = 1100; //zł
//        double discountPrice = price;
//        if(clientPremium && price > 1000) {
//            discountPrice *= 0.85; //15% taniej klient premium i zakupy powyżej 1000zł
//        } else if(price > 1000) {
//            discountPrice *= 0.9; //10% zniżki na zakupy powyżej 1000zł
//        } else if(clientPremium) {
//            discountPrice *= 0.95; //5% zniżki dla klienta premium na dowolne zakupy
//        }
//
//        System.out.println("Witaj " + firstName + " " + lastName);
//        System.out.println("Kwota przed rabatem: " + price);
//        System.out.println("Do zapłaty (po rabacie): " + discountPrice);

        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        System.out.println("Witaj " + client1.getFirstName() + " " + client1.getLastName());
        System.out.println("Kwota przed rabatem: " + price1);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount1);

        System.out.println("Witaj " + client2.getFirstName() + " " + client2.getLastName());
        System.out.println("Kwota przed rabatem: " + price2);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount2);



        }




    }





}
