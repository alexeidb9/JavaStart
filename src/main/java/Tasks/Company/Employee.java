package Tasks.Company;

public class Employee {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double experience;

    public Employee(String firstName, String lastName, String dateOfBirth, double experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.experience = experience;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getExperience() {
        return experience;
    }
}

