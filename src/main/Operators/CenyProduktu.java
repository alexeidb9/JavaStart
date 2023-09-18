package main.Operators;

public class CenyProduktu {
    public static void main(String[] args) {

        double priceNetto = 123;
        double vat = 0.23;

        double priceBrutto = priceNetto + (priceNetto * vat);

        System.out.println(priceBrutto);



    }

}
