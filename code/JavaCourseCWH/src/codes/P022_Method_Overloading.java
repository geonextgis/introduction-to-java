package code.JavaCourseCWH.src.codes;

public class P022_Method_Overloading {

    /*
     * This program demonstrates method overloading in Java.
     * Method overloading allows multiple methods to have the same name but different parameter lists.
     */

    // Method 1: No parameters
    static void foo() {
        System.out.println("Good morning bro!");
    }

    // Method 2: Single parameter
    static void foo(int a) {
        System.out.println("Good morning " + a + " bro!");
    }

    // Method 3: Two parameters
    static void foo(int a, int b) {
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    // Method to demonstrate changing an integer value
    static void changeInt(int x) {
        x = 98; // This changes only the local copy of the variable.
    }

    // Method to demonstrate changing an array
    static void changeArr(int[] arr) {
        arr[0] = 98; // This modifies the original array because arrays are passed by reference.
    }

    // Method to tell a joke
    static void tellJoke() {
        System.out.println("I invented a new word!\nPlagiarism!");
    }

    // Method for conditional logic
    static int logic(int x, int y) {
        int result;
        if (x > y) {
            result = x + y;
        } else {
            result = (x + y) * 5;
        }
        return result;
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        int a = 6;
        int b = 7;

        // Using the logic method
        int result = logic(a, b);
        System.out.println("The value of a + b is: " + result);

        // Using the tellJoke method
        tellJoke();

        // Case 1: Passing an integer to changeInt
        changeInt(a); 
        System.out.println("The value of x after running changeInt is: " + a); 
        // Output will show no change because primitives are passed by value in Java.

        // Case 2: Passing an array to changeArr
        int[] marks = {10, 8, 9, 7, 6};
        changeArr(marks); 
        System.out.println("The value of the first element of marks after running changeArr is: " + marks[0]); 
        // Output will show the first element changed because arrays are passed by reference.

        // Demonstrating method overloading
        foo();               // Calls the method with no parameters.
        foo(3000);           // Calls the method with one integer parameter.
        foo(3000, 4000);     // Calls the method with two integer parameters.
    }
}
