package Tasks.Pizzeria;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Available pizzas:");
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Pick your pizza");
        Pizza pizza = Pizza.valueOf(input.nextLine());

        System.out.println("Thanks for your order: " + pizza.name());
        input.close();

    }
}
