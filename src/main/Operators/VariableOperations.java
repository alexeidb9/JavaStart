package main.Operators;

import java.util.Random;

public class VariableOperations {

    public static void main(String[] args) {

        Random random = new Random();


        int x = random.nextInt(10);
        int y = random.nextInt(10);
        boolean isXGreaterThanY = x > y;
        boolean isYGreaterThanX = x < y;

        System.out.println("Czy x jest większe od y?");
        System.out.println(isXGreaterThanY);

        x *= 2;

        System.out.println("Czy x pomnożone przez 2 jest większe od y?");
        System.out.println(isXGreaterThanY);

        x = 1;

        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?");
        boolean isYLessOfSum = y < (x + 3) && y > (x - 2);
        System.out.println(isYLessOfSum);


        System.out.println("Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)");


    }


}
