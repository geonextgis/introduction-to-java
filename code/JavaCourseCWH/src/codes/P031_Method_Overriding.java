package code.JavaCourseCWH.src.codes;

// Demonstrating method overriding in Java

// Base class A
class A {

    // Method to print a name
    public void print_name() {
        System.out.println("My name is Krish!");
    }

    // Method to be overridden in the derived class
    public void method2() {
        System.out.println("This is a method from class A");
    }
}

// Derived class B extending class A
class B extends A {

    // Overriding the method2() from class A
    @Override
    public void method2() {
        // Providing a different implementation of method2
        System.out.println("This is a method from class B");
    }
}

// Main class to demonstrate method overriding
public class P031_Method_Overriding {
    public static void main(String[] args) {

        // Creating an object of class A and calling its methods
        System.out.println("Object of class A: ");
        A obj_A = new A();
        obj_A.print_name(); // Calls the print_name() method of class A
        obj_A.method2();    // Calls the method2() method of class A

        System.out.println();

        // Creating an object of class B and calling its methods
        System.out.println("Object of class B: ");
        B obj_B = new B();
        obj_B.print_name(); // Inherited from class A
        obj_B.method2();    // Calls the overridden method2() from class B
    }
}
