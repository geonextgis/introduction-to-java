package code.JavaCourseCWH.src.codes;

// Demonstrating 'this' and 'super' keywords in Java

// Base class representing a Human
class Human {

    // Field to store the name of the human
    String name;

    // Constructor of the Human class
    public Human(String name) {
        // 'this' keyword refers to the current instance of the class
        this.name = name; // Assigns the passed parameter to the instance variable
    }

    // Getter method for the 'name' field
    public String getName() {
        return this.name; // 'this' ensures the instance variable 'name' is returned
    }

    // Method to return the default language of a Human
    public String language() {
        String lang = "English";
        return lang;
    }
}

// Subclass (Child class) inheriting from the Human class
class Male extends Human {

    // Constructor of the Male class
    public Male(String name) {
        // 'super' keyword is used to call the constructor of the parent class (Human)
        super(name); // Passes the 'name' parameter to the Human class constructor
        System.out.println("I am a constructor of Male class");
    }
}

// Main class to demonstrate the use of 'this' and 'super' keywords
public class P030_This_and_Super {

    public static void main(String[] args) {

        // Creating an object of the Human class
        Human human1 = new Human("Krishnagopal Halder");
        // Accessing the name using the getName() method
        System.out.println("The name of the human: " + human1.getName());

        // Creating an object of the Male class
        Male male1 = new Male("Abir Ghosh");
        // Accessing the name using the inherited getName() method
        System.out.println("The name of the male: " + male1.getName());
    }
}
