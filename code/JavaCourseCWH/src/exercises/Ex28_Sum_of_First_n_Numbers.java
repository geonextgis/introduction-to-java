/*
 * Write a program to sum first n even numbers using while loop
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex28_Sum_of_First_n_Numbers {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        int count = 0;
        int current_even = 2;

        while (count<n) {
            sum += current_even;
            current_even += 2;
            count++;
        }

        System.out.println("The sum of first " + n + " number is " + sum);
    }
}
