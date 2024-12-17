/*
 * Write a program to print first n natural numbers in reverse order
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex26_First_n_Natural_Numbers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        for (int i=n; i>0; i--) {
            System.out.println(i);
        }
    }
}
