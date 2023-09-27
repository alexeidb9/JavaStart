package Lessons.Calculator;

public class CalcTest {

    public static void main(String[] args) {

        String app = "Calculator v0.2";

        Calculator calculator = new Calculator();

        double a = 30;
        double b = 20;
        double c = 10;

        System.out.println(calculator.calculate(a,b,"+"));

    }


}
