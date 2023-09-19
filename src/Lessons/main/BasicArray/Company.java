package Lessons.main.BasicArray;

public class Company {

    public static void main(String[] args) {
//        Employee[] employees = new Employee[20];
//        employees[0] = new Employee("Jan", "Nowak", 3500);
//        employees[1] = new Employee("Marta", "Zięba", 3700);
//        employees[2] = new Employee("Karol", "Wojak", 4500);

        Employee[] employees = new Employee[20];
        employees[0] = new Employee("Jan", "Nowak", 3500);
        employees[1] = new Employee("Marta", "Zięba", 3700);
        employees[2] = new Employee("Karol", "Wojak", 4500);

        int employeeIndex = 2;
        System.out.println(employees[employeeIndex-1].getFirstName()+" "+
                employees[employeeIndex-1].getLastName()+": "+
                employees[employeeIndex-1].getSalary()+"zł");

//        Employee[] employees = new Employee[20];
//        employees[0] = new Employee("Jan", "Nowak", 3500);
//        employees[1] = new Employee("Marta", "Zięba", 3700);
//        employees[2] = new Employee("Karol", "Wojak", 4500);
//
//        int employeeIndex = 2;
//        System.out.println(employees[employeeIndex-1].getFirstName()+" "+
//                employees[employeeIndex-1].getLastName()+": "+
//                employees[employeeIndex-1].getSalary()+"zł");
//        //błąd - ostatni indeks z 20 elementowej tablicy to 19
//        System.out.println(employees[20]);
//        System.out.println("Ten tekst się nie wyświetli, bo nastąpił błąd programu");


//        Employee[] employees = new Employee[20];
//        employees[0] = new Employee("Jan", "Nowak", 3500);
//        employees[1] = new Employee("Marta", "Zięba", 3700);
//        employees[2] = new Employee("Karol", "Wojak", 4500);
//
//        int employeeIndex = 4;
//        System.out.println(employees[employeeIndex].getFirstName()+" "+
//                employees[employeeIndex].getLastName()+": "+
//                employees[employeeIndex].getSalary()+"zł");
//        System.out.println("Ten kod się nie wyświetli z powodu błędu NullPointerException");

//        Employee[] employees = new Employee[20];
//        employees[0] = new Employee("Jan", "Nowak", 3500);
//        employees[1] = new Employee("Marta", "Zięba", 3700);
//        employees[2] = new Employee("Karol", "Wojak", 4500);
//
//        int employeesSize = employees.length;
//        System.out.println("Wielkość tablicy: " + employeesSize);
//        System.out.println("Ostatni element tablicy to: " + employees[employeesSize - 1]);
    }
}
