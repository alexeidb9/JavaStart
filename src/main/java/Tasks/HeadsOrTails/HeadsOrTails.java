package Tasks.HeadsOrTails;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

    private Scanner sc = new Scanner(System.in);
    private Random rn = new Random();
    private final int obverse = 1;
    private final int reverse = 0;
    private final int noChoice = -1;
    private int userChoice = noChoice;
    private int flipResult = noChoice;

    private void showOptions() {
            System.out.println("Choose one of two options: ");
            System.out.println(obverse + " - head");
            System.out.println(reverse + " - tail");
        }

        void betResult() {
        showOptions();
        userChoice = sc.nextInt();
        }

        void flipCoin() {
        flipResult = rn.nextInt(2);
        }

        void showResult () {
            if (userChoice == noChoice) {
                System.out.println("You didn't place the bet");
            } else if (flipResult == noChoice) {
                System.out.println("You didn't toss the coin");
            } else if(userChoice == flipResult) {
                if (flipResult == obverse) {
                    System.out.println("Bingo, it is head! You won!");
                } else {
                    System.out.println("Bingo, it is tail! You won!");
                }
            } else {
                System.out.println("You choice was wrong! Looser!");
            }
        }


    }


