package Tasks.Dice;

import java.util.Random;

public class Dice {
    private final static Random RANDOM = new Random();
    private final static String[] SIDES = {
                """
                 - - - - -
                |         |
                |    0    |
                |         |
                 - - - - -
                """,
                """
                 - - - - -
                |        0|
                |         |
                |0        |
                 - - - - -
                """,
                """
                 - - - - -
                |        0|
                |    0    |
                |0        |
                 - - - - -
                """,
                """
                 - - - - -
                |0       0|
                |         |
                |0       0|
                 - - - - -
                ""","""
                 - - - - -
                |0       0|
                |    0    |
                |0       0|
                 - - - - -
                ""","""
                 - - - - -
                |0   0   0|
                |         |
                |0   0   0|
                 - - - - -
                """

    };

    int top;

    Dice() {
        top = new Random().nextInt(6) + 1;
    }

    Dice (int top) {
        this.top = top;
    }

    static String roll () {
        int side = RANDOM.nextInt(SIDES.length);
        return SIDES[side];
    }

    void printInfo () {
        System.out.println("Liczba oczek na kostce: " + top);

    }


}
