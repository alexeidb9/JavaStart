package Projects.Calculator.app;

import Projects.Calculator.calc.Calculator;
import Projects.Calculator.exceptions.UnknownOperatorException;

public class CalcApp {

    public static void main(String[] args) {

        String app = "Calculator v0.5";

        try {
            Calculator.start();
        } catch (UnknownOperatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
        }


    }
}