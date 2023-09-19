package Lessons.Phone.application;

import Lessons.Phone.logic.Charger;
import Lessons.Phone.model.Telephone;

class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.displayInformation());
        Charger charger = new Charger();
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        System.out.println("Telefon po naładowaniu");
        System.out.println(telephone.displayInformation());


    }
}