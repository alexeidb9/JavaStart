package Lessons.Dice;

public class ThrowDice {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice(3);

        dice2.roll();
        dice2.printInfo();

    }

}
