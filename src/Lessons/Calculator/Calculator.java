package Lessons.Calculator;

import java.util.Objects;

public class Calculator {


    public double calculate(double a, double b, String operator) {
        switch (operator.toLowerCase()) {
            case "add":
            case "+":
                return a + b;

            case "subtract":
            case "-":
                return a - b;

            case "divide":
            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
                return a / b;

            case "multiply":
            case "*":
                return a * b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }




}
