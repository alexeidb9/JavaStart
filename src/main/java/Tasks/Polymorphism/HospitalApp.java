package Tasks.Polymorphism;

public class HospitalApp {
    public static void main(String[] args) {


        Hospital hospital = new Hospital();

        hospital.add(new Doctor("Adam", "Nowak", 2300, 500));
        hospital.add(new Nurse("Ewa", "Roland", 1200, 20));
        hospital.add(new Nurse("Aga", "Szewska", 1400, 30));

        System.out.println(hospital.getInfo());





    }


}
