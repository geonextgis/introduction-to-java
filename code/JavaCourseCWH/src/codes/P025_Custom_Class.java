package code.JavaCourseCWH.src.codes;

class Employee {
    int id;
    String name;
    int salary;

    public void print_details() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class P025_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee krish = new Employee();
        Employee abir = new Employee();

        // Setting attributes/properties
        krish.id = 1;
        krish.name = "Krishnagopal Halder";
        krish.salary = 30000;

        abir.id = 2;
        abir.name = "Abir Ghosh";
        abir.salary = 25000;
        
        // Printing the attributes/properties
        // System.out.println("The ID of the employee: " + krish.id);
        // System.out.println("The name of the employee: " + krish.name);
        krish.print_details();
        System.out.println("Salary of Krish: " + krish.getSalary());
        abir.print_details();
        System.out.println("Salary of Abir: " + abir.getSalary());
    }
}
