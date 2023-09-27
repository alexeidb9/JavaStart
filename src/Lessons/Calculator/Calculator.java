package Lessons.Calculator;


import java.util.Scanner;

public class Calculator {


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
