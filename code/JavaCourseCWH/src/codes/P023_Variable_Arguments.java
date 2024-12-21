package code.JavaCourseCWH.src.codes;

public class P023_Variable_Arguments {

    /*
     * This program demonstrates variable arguments (varargs) in Java.
     * Varargs allow methods to accept a variable number of arguments, simplifying the method signature.
     */

    // Method to calculate the sum of two integers
    static int sum(int a, int b) {
        return a + b;
    }

    // Method to calculate the sum of three integers
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method using varargs to calculate the sum of any number of integers
    static int sum(int... arr) {
        // The varargs parameter is internally treated as an array (int[] arr).
        int result = 0;

        // Loop through each element in the array and add it to the result
        for (int element : arr) {
            result += element;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");

        // Calling the sum method with two arguments
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));

        // Calling the sum method with three arguments
        System.out.println("The sum of 4, 5, and 7 is: " + sum(4, 5, 7));

        // Calling the varargs sum method with more than three arguments
        System.out.println("The sum of 4, 5, 7, and 9 is: " + sum(4, 5, 7, 9));
    }
}
