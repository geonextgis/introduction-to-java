/*
 * Write a program to print first n odd numbers using a for loop
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex25_First_n_Odd_Numbers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // 2n = Even Numbers = 0, 2, 4, 6, 8
        // 2n + 1 = Odd Numbers = 1, 3, 5, 7, 9

        for (int i=0; i<n; i++) {
            System.out.println(2 * i + 1);
        }
    }
}

