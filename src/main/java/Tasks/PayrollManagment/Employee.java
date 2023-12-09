package Tasks.PayrollManagment;

abstract class Employee {

    public static final int NO_OF_MONTHS = 12;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + '\'' +
                  lastName + '\'' + ", monthly salary is: " + getMonthlySalary() + ", annual salary is: " + getAnnualSalary();
    }



    abstract double getAnnualSalary ();
    abstract double getMonthlySalary ();




}
