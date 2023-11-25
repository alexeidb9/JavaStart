package Tasks.Point.app;

import Tasks.Point.controller.PointController;
import Tasks.Point.data.Point;

public class PointApplication {

    public static void main(String[] args) {


        Point p1 = new Point(10, 20);
        PointController pc = new PointController();

        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;

        int option = addX;

        switch (option) {

            case addX -> pc.addX(p1);
            case addY -> pc.addY(p1);
            case minusX -> pc.minusX(p1);
            case minusY -> pc.minusY(p1);

        }

        System.out.println("Punkt po zmianie: (" + p1.getX() + ";" + p1.getY() + ")");

    }


}
