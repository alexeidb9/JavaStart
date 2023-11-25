package Projects.Calculator.calc;

import Projects.Calculator.model.Circle;
import Projects.Calculator.model.Rectangle;
import Projects.Calculator.model.Shape;
import Projects.Calculator.model.Triangle;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {

    private Scanner sc = new Scanner(System.in);

    public Shape createShape() {
        int shapeType = sc.nextInt();
        switch (shapeType) {
            case Shape.RECTANGLE:
                return readRectangleData();
            case Shape.CIRCLE:
                return readCircleData();
            case Shape.TRIANGLE:
                return readTriangleData();
            default:
                throw new NoSuchElementException();
            }
        }

    public void closeScanner() {
        sc.close();
    }

    private Rectangle readRectangleData () {
        System.out.println("Provide an information for rectangle:");
        System.out.println("Provide length for side A: ");
        double a = sc.nextDouble();
        System.out.println("Provide length for side B: ");
        double b = sc.nextDouble();

        return new Rectangle(a,b);
    }

    private Triangle readTriangleData () {
        System.out.println("Provide an information for triangle:");
        System.out.println("Provide length for side A: ");
        double a = sc.nextDouble();
        System.out.println("Provide length for side B: ");
        double b = sc.nextDouble();
        System.out.println("Provide length for side c: ");
        double c = sc.nextDouble();

        System.out.println("Provide height: ");
        double h = sc.nextDouble();

        return new Triangle(a,b,c,h);
    }


    private Circle readCircleData () {
        System.out.println("Provide an information for circle:");
        System.out.println("Provide radius: ");
        double r = sc.nextDouble();

        return new Circle(r);
    }


    public void clearBuffer() {
    sc.nextLine();
    }
}
