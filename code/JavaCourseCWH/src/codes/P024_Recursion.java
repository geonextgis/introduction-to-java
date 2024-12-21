package code.JavaCourseCWH.src.codes;

public class P024_Recursion {

    /*
     * This program demonstrates the concept of recursion in Java by calculating the factorial of a number using both:
     * 1. Iterative approach
     * 2. Recursive approach
     */

    // Iterative method to calculate factorial
    static int factorial_iterative(int n) {
        int result = 1;

        // Multiply numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // Recursive method to calculate factorial
    static int factorial(int n) {
        /*
         * Base Case:
         * If n is 0 or 1, the factorial is 1.
         * This stops further recursive calls and avoids infinite recursion.
         */
        if (n == 0 || n == 1) {
            return 1;
        }

        /*
         * Recursive Case:
         * Multiply n by the factorial of (n-1). The function keeps calling itself
         * with decreasing values of n until it reaches the base case.
         */
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Calculate factorial using iterative approach
        System.out.println("The value of factorial n using iterative approach is: " + factorial_iterative(8));

        // Calculate factorial using recursive approach
        System.out.println("The value of factorial n using recursive approach is: " + factorial(8));
    }
}
