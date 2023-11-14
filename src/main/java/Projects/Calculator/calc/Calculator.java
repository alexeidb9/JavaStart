package Projects.Calculator.calc;


import Projects.Calculator.exceptions.UnknownOperatorException;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";


    public static void start() {
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


    public static double calculate(String operator, double... numbers) throws ArithmeticException, UnknownOperatorException {

        if (numbers.length < 2) {
            throw new IllegalArgumentException("At least two numbers are required for calculations.");
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            switch (operator.toLowerCase()) {
                case PLUS:
                    result += numbers[i];
                    break;

                case MINUS:
                    result -= numbers[i];
                    break;

                case DIVIDE:
                    if (numbers[i] == 0)
                        throw new ArithmeticException("Division by zero is not allowed.");
                    result /= numbers[i];
                    break;

                case MULTIPLY:
                    result *= numbers[i];
                    break;

                default:
                    throw new UnknownOperatorException("Invalid operator: " + operator);
            }

        }

        return result;
    }




}
