package Lessons.main.CarShop.logic;

import Lessons.main.CarShop.data.Car;

public class CarShop {

    public static void main(String[] args) {

        Car audiA5 = new Car(2006,"Audi", "A5");
        Car audiA6 = new Car(2009,"Audi", "A6", "White");
        audiA5.printInfo();
        System.out.println("-----------------------------");
        audiA6.printInfo();
        System.out.println("-----------------------------");

    }


}
