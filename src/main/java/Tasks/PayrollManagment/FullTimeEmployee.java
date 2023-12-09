package Tasks.PayrollManagment;

public class FullTimeEmployee extends Employee {

    private static final double YEARLY_BONUS = 0.05;
    private double baseSalary;

    public FullTimeEmployee(String firstName, String lastName, double baseSalary) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double getAnnualSalary() {
        double baseAnnualSalary = baseSalary * NO_OF_MONTHS;
        double bonus = baseAnnualSalary * YEARLY_BONUS;
        return baseAnnualSalary + bonus;
    }

    @Override
    double getMonthlySalary() {
        return baseSalary;
    }
}
