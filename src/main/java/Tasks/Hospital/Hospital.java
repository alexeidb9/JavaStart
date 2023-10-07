package Tasks.Hospital;

import java.util.Scanner;

public class Hospital {

    final private Patient[] patients = new Patient[2];
    private int numberOfPatients = 0;

    Patient[] addToQueue (Patient p) {

        if (numberOfPatients == patients.length) {
            System.out.println("The queue is full.");
        } else if (numberOfPatients < patients.length) {
            patients[numberOfPatients] = p;
            numberOfPatients++;
        }
        return patients;
        }



    void printList () {

    }

    public Patient[] getPatients() {
        return patients;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }
}
