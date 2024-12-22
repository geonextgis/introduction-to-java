/*
 * Write a function to print n-th term of fibonacci series using recursion
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex48_Fibonacci_Series {

    static int fibonacci (int n) {

        if (n==0) {
            return 0;
        }

        else if (n==1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main (String[] args) {

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.format("%d-th term of the fibonacci series is: %d", n, fibonacci(n));
    }
}
