package code.JavaCourseCWH.src.codes;

public class P021_Methods {

    /*
     * This is a simple program to demonstrate the use of methods in Java.
     * Methods are blocks of code that perform specific tasks and can be reused.
     * The program defines a static method `logic` to perform conditional arithmetic.
     */

    // Static method `logic` that takes two integers as parameters and returns an integer.
    static int logic(int x, int y) {

        int result; // Variable to store the result of the logic.

        // Conditional logic to calculate the result.
        if (x > y) {
            result = x + y; // If `x` is greater than `y`, return their sum.
        } else {
            result = (x + y) * 5; // Otherwise, return five times their sum.
        }

        return result; // Return the calculated result.
    }

    // Main method, the entry point of the program.
    public static void main(String[] args) {
        int a = 5; // Declare and initialize variable `a`.
        int b = 7; // Declare and initialize variable `b`.
        int c;     // Variable to store the result.

        // Call the static method `logic` with `a` and `b` as arguments and store the result in `c`.
        c = logic(a, b);

        /*
         * Alternative way to call the method:
         * If the `logic` method is not static, create an object of the class
         * and call the method using the object.
         * Uncomment the lines below to see how it works.
         */
        // P021_Methods obj = new P021_Methods();
        // c = obj.logic(a, b);

        // Display the result.
        System.out.println("The value of c is: " + c);
    }
}
