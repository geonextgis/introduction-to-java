/*
 * Write a program to find factorial of a given number using while loop
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex32_Factorial_While_Loop {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        int f = 1;
        sc.close();

        while (i<=n) {
            f *= i;
            i++;
        }

        System.out.println("The factorial of " + n + " is " + f);
    }
}
