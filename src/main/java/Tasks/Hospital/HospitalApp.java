package Tasks.Hospital;

public class HospitalApp {

    public static void main(String[] args) {


// 0 - wyjście z programu, 1 - dopisanie pacjenta, 2 - wyświetlenie listy zapisanych pacjentów.

//        Ograniczenia:
//
// Aplikacja powinna działać do tego momentu, aż użytkownik nie wybierze opcji 0, czyli wyjścia z programu.


        Hospital hospital = new Hospital();

        Patient patient1 = new Patient("Bob", "Yo", 12345);
        Patient patient2 = new Patient("Bob", "Yo", 12343);
        Patient patient3 = new Patient("Bob", "Yo", 12343);

        hospital.addToQueue(patient1);
        hospital.addToQueue(patient2);

        System.out.println(hospital.getPatients()[0].getLastName());
        hospital.addToQueue(patient3);


    }
}
