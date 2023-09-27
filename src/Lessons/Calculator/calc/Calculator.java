package Lessons.Calculator.calc;


import java.util.Locale;
import java.util.Scanner;

public class Calculator {


    public void start() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Type in first number: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Provide an operation you want to perform: (+, -, /, *)");
        String operator = sc.nextLine();
        System.out.println("Type in another number: ");
        double b = sc.nextDouble();

        System.out.println(calculate(operator,a,b));

        sc.close();
    }


    public double calculate(String operator, double... numbers) {

        if (numbers.length < 2) {
            throw new IllegalArgumentException("At least two numbers are required for calculations.");
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            switch (operator.toLowerCase()) {
                case "add":
                case "+":
                    result += numbers[i];
                    break;

                case "subtract":
                case "-":
                    result -= numbers[i];
                    break;

                case "divide":
                case "/":
                    if (numbers[i] == 0) {
                        throw new IllegalArgumentException("Division by zero is not allowed.");
                    }
                    result /= numbers[i];
                    break;

                case "multiply":
                case "*":
                    result *= numbers[i];
                    break;

                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        return result;
    }




}
