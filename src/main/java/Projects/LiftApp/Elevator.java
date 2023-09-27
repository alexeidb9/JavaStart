package Projects.LiftApp;

public class Elevator {
    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;


    void add(Person person) {
        if (peopleNumber < 4) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else {
            System.out.println("Winda jest pełna, brak wolnego miejsca");
        }
    }

    public void clear(Elevator elevator) {

        if (elevator.people != null) {
            for (Person person : elevator.people) {
                elevator.people = null;
            }
            elevator.peopleNumber = 0;
        }

    }

    void start(Elevator elevator) {
        if (getTotalWeight(elevator) > maxWeight) {
            int overload = getTotalWeight(elevator) - maxWeight;
            System.out.println("Winda jest przeciążona o " + overload + "kg");
        } else {
            System.out.println("Winda wystartowała");
        }
    }

    private int getTotalWeight(Elevator elevator) {
        int weight = 0;

        if (elevator.people != null) {
            for (Person person : elevator.people) {
                weight += person.getWeight();
            }


        }
        return weight;

    }

}
