package code.JavaCourseCWH.src.codes;

// Demonstrating Access Modifiers, Getters, and Setters in Java

// Defining the Employee class
class Employee {
    // Fields (attributes) declared as private
    private int id; // Employee ID
    private String name; // Employee name

    // Getter for the 'id' field
    public int getID() {
        // Returns the value of the 'id' field
        return id;
    }

    // Setter for the 'id' field
    public void setID(int i) {
        // Sets the value of the 'id' field
        id = i;
        // Prints a confirmation message
        System.out.println("ID set successfully!");
    }

    // Getter for the 'name' field
    public String getName() {
        // Returns the value of the 'name' field
        return name;
    }

    // Setter for the 'name' field
    public void setName(String n) {
        // Sets the value of the 'name' field
        name = n;
        // Prints a confirmation message
        System.out.println("Name changed successfully!");
    }
}

// Main class to demonstrate the use of access modifiers, getters, and setters
public class P026_Access_Modifiers {
    public static void main(String[] args) {

        // Creating an object of the Employee class
        Employee emp1 = new Employee();

        // Attempting to access private fields directly
        // emp1.id = 1;  // Error: 'id' has private access in Employee
        // emp1.name = "Krishnagopal Halder"; // Error: 'name' has private access in Employee

        // Using setters to modify private fields
        emp1.setName("Krishnagopal Halder"); // Sets the name using the setter method
        // Using the getter to retrieve and print the name
        System.out.println("The name of the employee: " + emp1.getName());

        // Using setters to modify the 'id' field
        emp1.setID(1); // Sets the ID using the setter method
        // Using the getter to retrieve and print the name
        System.out.println("The id of the employee: " + emp1.getID());
    }
}
