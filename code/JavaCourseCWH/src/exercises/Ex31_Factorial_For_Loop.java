/*
 * Write a program to find factorial of a given number using for loops
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex31_Factorial_For_Loop {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int f = 1;

        for (int i=1; i<n+1; i++) {
            f *= i;
        }

        System.out.println("The factorial of " + n + " is " + f);
    }
}
