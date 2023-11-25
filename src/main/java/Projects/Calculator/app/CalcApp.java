package Projects.Calculator.app;

import Projects.Calculator.calc.Calculator;
import Projects.Calculator.calc.ShapeCalculator;
import Projects.Calculator.exceptions.UnknownOperatorException;
import Projects.Calculator.model.Shape;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class CalcApp {

    public static void main(String[] args) {

        String app = "Calculator v0.6";

//        try {
//            Calculator.start();
//        } catch (UnknownOperatorException | ArithmeticException e) {
//            System.err.println(e.getMessage());
//        }

        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;

        boolean readComplete = false;

        while (!readComplete) {
            try {
                printOptions();
                shape = shapeCalc.createShape();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format for input data, try again.");
            } catch (NoSuchElementException e) {
                System.out.println("Chosen shape id is wrong, try again");
            } finally {
                shapeCalc.clearBuffer();
            }
        }
        System.out.println(shape);
        shapeCalc.createShape();

    }

    private static void printOptions() {
        System.out.println("Choose shape for which you want to perform calculations: ");
        System.out.println(Shape.RECTANGLE + " - rectangle");
        System.out.println(Shape.CIRCLE + " - circle");
        System.out.println(Shape.TRIANGLE + " - triangle");

    }
}