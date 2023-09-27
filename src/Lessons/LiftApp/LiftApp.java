package Lessons.LiftApp;

public class LiftApp {
    public static void main(String[] args) {

        final String appName = "Elevator v0.1";

    Person person1 = new Person(11,65);
    Person person2 = new Person(31,105);
    Person person3 = new Person(24,78);
    Person person4 = new Person(15,89);
    Person person5 = new Person(16,120);

    Elevator elevator = new Elevator();
    elevator.add(person1);
    elevator.add(person2);
    elevator.add(person3);
    elevator.add(person4);

    elevator.start(elevator);


    }



}
