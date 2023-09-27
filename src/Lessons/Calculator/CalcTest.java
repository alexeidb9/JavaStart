package Lessons.Calculator;

import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {

        String app = "Calculator v0.3.1";

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide an operation you want to perform: ");
        System.out.println(calculator.calculate(sc.next(), 1,2,3,4,5));

    }


}
