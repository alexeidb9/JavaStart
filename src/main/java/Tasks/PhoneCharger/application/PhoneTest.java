package Tasks.PhoneCharger.application;

import Tasks.PhoneCharger.model.Telephone;
import Tasks.PhoneCharger.logic.Charger;

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