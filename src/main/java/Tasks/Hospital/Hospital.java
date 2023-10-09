package Tasks.Hospital;

import java.util.Scanner;


public class Hospital {

    final private int maxPatientsNumber = 10;
    private Patient[] patients = new Patient[maxPatientsNumber];
    private int regPatients = 0;

    void addPatient(Patient patient) {

        if (regPatients < maxPatientsNumber) {
            patients[regPatients] = patient;
            regPatients++;
        } else {
            System.out.println("Limit is reached for today.");
        }


    }

    void printPatients() {
        for (int i = 0; i < regPatients; i++) {
            patients[i].getInfo();
        }

        }

    }

