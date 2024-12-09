/*
 * Write a program to sum three numbers in Java.
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex02_Sum_of_Three_Numbers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number 1:");
        float num1 = sc.nextFloat();

        System.out.println("Enter the number 2:");
        float num2 = sc.nextFloat();

        System.out.println("Enter the number 3:");
        float num3 = sc.nextFloat();

        float sum = num1 + num2 + num3;
        System.out.print("Sum of the three numbers:");
        System.out.println(sum);
    }
}
