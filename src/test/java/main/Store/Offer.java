package main.Store;

class Offer {
    Product product;
    double price;
    boolean special;

    Offer() {}
    Offer(Product p, double pr, boolean sp) {
        product = p;
        price = pr;
        special = sp;
    }

    void showOffer () {
        System.out.println(product.name + " "
                + product.producer + " "
                + price + "zł, "
                + "oferta specjalna? " + special);
    }

}