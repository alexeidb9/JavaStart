package Tasks.Dice;

import java.util.Scanner;

public class ThrowDice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Press Enter to roll the dice");
        input.nextLine();
        System.out.println(Dice.roll());

    }

}
