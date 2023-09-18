package main.Dice;

import java.util.Random;

public class Dice {

    int top;

    Dice() {
        top = new Random().nextInt(6) + 1;
    }

    Dice (int top) {
        this.top = top;
    }

    void roll () {
        top = new Random().nextInt(6) + 1;
    }

    void printInfo () {
        System.out.println("Liczba oczek na kostce: " + top);
    }


}
