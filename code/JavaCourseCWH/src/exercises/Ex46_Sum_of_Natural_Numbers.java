/*
 * Write a recursive function to calculate the sum of first n natural numbers
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex46_Sum_of_Natural_Numbers {
    
    static int sum_of_natural_numbers (int n) {

        if (n == 1) {
            return 1;
        }

        else {
            return n + sum_of_natural_numbers(n-1);
        }
    }

    public static void main (String[] args) {

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.format("The sum of %d natural number is: %d", n, sum_of_natural_numbers(n));
    }
}
