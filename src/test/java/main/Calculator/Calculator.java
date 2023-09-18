package main.Calculator;

public class Calculator {

    double add(double a, double b) {

        return a + b;

    }

    double add(double a, double b, double c) {

        return add(a, b) + c;

    }

    double subtract(double a, double b) {
        return a - b;
    }

    double subtract(double a, double b, double c) {
        return subtract(a, b) - c;
    }


    double divide(double a, double b) {

        return a / b;

    }

    double multiply(double a, double b) {

        return a * b;

    }


}
