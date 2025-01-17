package code.JavaCourseCWH.src.codes;

// Parent class: Phone
class Phone {
    // Method to greet
    public void greet() {
        System.out.println("Good morning!");
    }

    // Method to print the name of the class
    public void name() {
        System.out.println("My name is Phone.");
    }
}

// Child class: SmartPhone extends Phone
class SmartPhone extends Phone {
    // Additional method specific to SmartPhone
    public void swagat() {
        System.out.println("Apka swagat hai!");
    }

    // Overriding the name() method of the parent class
    @Override
    public void name() {
        System.out.println("My name is smartphone.");
    }
}

public class P032_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // Dynamic method dispatch demonstration

        // Creating a reference of the parent class (Phone)
        // and assigning an object of the child class (SmartPhone)
        Phone obj = new SmartPhone();

        // Calls the greet() method from the parent class
        obj.greet(); // Output: Good morning!

        // Calls the overridden name() method in the SmartPhone class
        obj.name(); // Output: My name is smartphone.

        // Note: The following line would cause an error because the reference type
        // (Phone) does not have access to methods specific to SmartPhone (e.g., swagat())
        // obj.swagat(); // This would result in a compile-time error.
    }
}
