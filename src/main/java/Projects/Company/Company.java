package Projects.Company;

public class Company {

    private Employee employeeSteve = new Employee("Steve","Jackson","1985.02.02",1.6);
    private Employee employeeAlex = new Employee("Alex","Wuffix","1994.02.02",1.4);
    private Employee employeeRob = new Employee("Rob","Jockowic","1994.02.02",4.4);

    public Employee getEmployeeSteve() {
        return employeeSteve;
    }

    public Employee getEmployeeAlex() {
        return employeeAlex;
    }

    public Employee getEmployeeRob() {
        return employeeRob;
    }
}
