package main.Agregacja;

import main.Auction.Adress;

public class Bank {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "4124552112";
        main.Auction.Adress adress1 = new main.Auction.Adress();
        adress1.city = "Wroclaw";
        adress1.street = "Hallera";
        adress1.postalCode = "444-22";
        adress1.houseNumber = 23;
        adress1.apartmentNumber = 2;
        person1.registeredAdress = adress1;
        person1.livingAdress = adress1;


        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Person person2 = new Person();
        person2.firstName = "Marta";
        person2.lastName = "Kowalska";
        person2.pesel = "4124521512";
        person2.registeredAdress = new Adress();
        person2.registeredAdress.apartmentNumber = 12;
        person2.registeredAdress.houseNumber = 5;
        person2.registeredAdress.city = "Krakow";
        person2.registeredAdress.street = "Kazimierz";
        person2.registeredAdress.postalCode = "42-234";
        person2.livingAdress = adress1;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 12_000;

        System.out.println("Osoba 1: ");
        System.out.println(person1.firstName + " " + person1.lastName + " ");
        System.out.println("Mieszka w miejscowości: " + person1.livingAdress.city);
        System.out.println("Stan konta: " + account1.balance);

        System.out.println("Osoba 2: ");
        System.out.println(person2.firstName + " " + person2.lastName + " ");
        System.out.println("Mieszka w miejscowości: " + person2.livingAdress.city);
        System.out.println("Stan konta: " + account2.balance);






    }


}
