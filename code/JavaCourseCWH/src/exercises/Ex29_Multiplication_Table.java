/*
 * Write a program to print multiplication table of a given number n
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex29_Multiplication_Table {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        for (int i=1; i<11; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
