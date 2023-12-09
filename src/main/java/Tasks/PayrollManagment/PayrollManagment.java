package Tasks.PayrollManagment;

public class PayrollManagment {
    public static void main(String[] args) {

        Employee[] employees = createEmployees();
        printEmployees(employees);

        System.out.println(totalMonthlySalaries(employees));
        System.out.println(totalAnnualSalaries(employees));



    }

    private static double totalAnnualSalaries(Employee[] employees) {
        double totalAnnualSalaries = 0;
        for (Employee employee : employees) {
            totalAnnualSalaries+= employee.getAnnualSalary();
        }
        return totalAnnualSalaries;
    }

    private static double totalMonthlySalaries(Employee[] employees) {
        double totalMonthlySalaries = 0;
        for (Employee employee : employees) {
            totalMonthlySalaries += employee.getMonthlySalary();
        }

        return totalMonthlySalaries;
    }

    private static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static Employee[] createEmployees() {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("George", "Hustler",2200);
        employees[1] = new PartTimeEmployee("Ann", "Winston",96,5);

        return employees;
    }


}
