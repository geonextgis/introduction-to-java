package code.JavaCourseCWH.src.codes;

// Demonstrating Constructor and Constructor Overloading in Java

// Defining the MyMainEmployee class
class MyMainEmployee {
    // Fields (attributes) of the class
    int id; // Employee ID
    String name; // Employee name

    // Constructor: A special method used to initialize objects
    // This constructor takes two parameters: an integer (i) and a string (n)
    public MyMainEmployee(int i, String n) {
        id = i; // Assigning the parameter 'i' to the field 'id'
        name = n; // Assigning the parameter 'n' to the field 'name'
    }

    public MyMainEmployee() {
        id = 0;
        name = "Default Name";
    }
    
    public MyMainEmployee(String n) {
        id = 0;
        name = n;
    }
    
    // Getter for the 'name' field
    public String getName() {
        return name; // Returns the value of 'name'
    }

    // Setter for the 'name' field
    public void setName(String n) {
        name = n; // Sets the value of 'name'
    }

    // Getter for the 'id' field
    public int getID() {
        return id; // Returns the value of 'id'
    }

    // Setter for the 'id' field
    public void setID(int i) {
        id = i; // Sets the value of 'id'
    }
}

// Main class to demonstrate constructor and constructor overloading
public class P027_Constructor {
    public static void main(String[] args) {
        // Creating an object using the constructor with parameters
        // The constructor automatically initializes the fields with the provided values
        MyMainEmployee emp1 = new MyMainEmployee(1, "Krishnagopal Halder"); // Constructor with id and name

        // MyMainEmployee emp2 = new MyMainEmployee(); // Default constructor
        // MyMainEmployee emp3 = new MyMainEmployee("Abir Ghosh"); // Constructor with name only

        // Printing the values initialized by the constructor
        System.out.println("The name of the employee: " + emp1.getName());
        System.out.println("The id of the employee: " + emp1.getID());
    }
}
