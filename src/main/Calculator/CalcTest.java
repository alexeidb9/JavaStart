package main.Calculator;

public class CalcTest {

    public static void main(String[] args) {

        TimeConverter timeConverter = new TimeConverter();
        int hours = 14;
        int minutes = timeConverter.hoursToMinutes(hours);
        int seconds = timeConverter.minutesToSeconds(minutes);
        int milliseconds = timeConverter.secondsToMilliseconds(seconds);


        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(milliseconds);


        Calculator calculator = new Calculator();

        double a = 30;
        double b = 20;
        double c = 10;

        System.out.println(calculator.add(a,b,c));
        System.out.println(calculator.subtract(a,b,c));
        System.out.println(calculator.add(b,c));

    }


}
