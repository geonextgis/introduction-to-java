package code.JavaCourseCWH.src.codes;
// Defining the Employee class
class Employee {
    // Fields (attributes) of the Employee
    int id; // Employee ID
    String name; // Employee name
    int salary; // Employee salary

    // Method to print employee details
    public void print_details() {
        // Printing the Employee's ID and Name
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    // Method to return the Employee's salary
    public int getSalary() {
        return salary;
    }
}

// Main class to demonstrate the Employee class
public class P025_Custom_Class {
    public static void main(String[] args) {
        // Printing a message to indicate program start
        System.out.println("This is our custom class");

        // Creating objects of the Employee class
        Employee krish = new Employee(); // First employee object
        Employee abir = new Employee();  // Second employee object

        // Setting attributes/properties for the first employee (Krish)
        krish.id = 1; // Setting ID for Krish
        krish.name = "Krishnagopal Halder"; // Setting name for Krish
        krish.salary = 30000; // Setting salary for Krish

        // Setting attributes/properties for the second employee (Abir)
        abir.id = 2; // Setting ID for Abir
        abir.name = "Abir Ghosh"; // Setting name for Abir
        abir.salary = 25000; // Setting salary for Abir
        
        // Printing the details of the first employee (Krish)
        krish.print_details(); // Calling the method to print details
        // Printing the salary of Krish
        System.out.println("Salary of Krish: " + krish.getSalary());

        // Printing the details of the second employee (Abir)
        abir.print_details(); // Calling the method to print details
        // Printing the salary of Abir
        System.out.println("Salary of Abir: " + abir.getSalary());
    }
}
