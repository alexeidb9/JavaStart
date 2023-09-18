package Lessons.main.Store;

class Shop {
    public static void main(String[] args) {


        Offer offer = new Offer(new Product("Milka", "Czekolada mleczna"), 3.99, true);
        offer.showOffer();

    }
}