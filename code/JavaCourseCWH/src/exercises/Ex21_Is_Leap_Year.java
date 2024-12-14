/*
 * Write a program to find whether a year entered by the user is a leap year or not.
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;


public class Ex21_Is_Leap_Year {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // divisible by 100
        boolean cond1 = ((year % 100) == 0);

        // divisible by 400
        boolean cond2 = ((year % 400) == 0);

        // divisible by 4
        boolean cond3 = ((year % 4) == 0);

        // divisible by 100, 400, and 4
        if ((cond1 && cond3) && (cond2)) {
            System.out.println(year + " is a leap year.");
        }

        // divisible by 4 but not with 100
        else if (cond3 && (!cond1)) {
            System.out.println(year + " is a leap year.");
        }

        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
