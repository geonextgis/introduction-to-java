/*
 * Write a program to print fibonacci series of first n numbers
 */

package code.JavaCourseCWH.src.exercises;

public class Ex43_Fibonacci_Sequence {

    static void fibonacci(int n) {
        // Initialize an array with size 'n' to hold the Fibonacci sequence
        int[] arr = new int[n];

        // Base cases
        if (n > 0) arr[0] = 0; // Fibonacci(0)
        if (n > 1) arr[1] = 1; // Fibonacci(1)

        // Calculate Fibonacci numbers for n > 2
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        // Print the Fibonacci sequence
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("The Fibonacci series up to 10 is: ");
        fibonacci(10);
    }
}
