/*
 * Write a program to find out whether a given integer is present in an array or not
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex36_Check_Integer_Presence {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        sc.close();

        int[] arr = {2, 6, 5, 8, 7};

        for (int element : arr) {
            if (element==n) {
                System.out.println("The integer " + n + " is present in the array");
                break;
            }
        }
    }
}
