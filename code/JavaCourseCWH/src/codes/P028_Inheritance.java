package code.JavaCourseCWH.src.codes;

// Demonstrating Inheritance in Java

// Base class (Parent class)
class Base {
    // Field (attribute) of the Base class
    int x;

    // Getter method for 'x'
    public int getX() {
        return x; // Returns the value of 'x'
    }

    // Setter method for 'x'
    public void setX(int n) {
        // Prints a message to indicate this method is in the Base class
        System.out.println("I am in base and setting x now");
        x = n; // Sets the value of 'x'
    }

    // Method to print a message (can be inherited by child classes)
    public void printMe() {
        System.out.println("I am a constructor");
    }
}

// Derived class (Child class) inheriting from the Base class
class Derived extends Base {
    // Additional field (attribute) specific to the Derived class
    int y;

    // Getter method for 'y'
    public int getY() {
        return y; // Returns the value of 'y'
    }

    // Setter method for 'y'
    public void setY(int n) {
        y = n; // Sets the value of 'y'
    }
}

// Main class to demonstrate inheritance
public class P028_Inheritance {
    public static void main(String[] args) {

        // Creating an object of the Base class
        Base b = new Base();
        b.setX(4); // Calls the Base class's method to set 'x'
        System.out.println(b.getX()); // Prints the value of 'x' (from Base class)

        // Creating an object of the Derived class
        Derived d = new Derived();
        d.setX(10); // Calls the inherited method from the Base class to set 'x'
        System.out.println(d.getX()); // Prints the value of 'x' (inherited from Base class)
    }
}
