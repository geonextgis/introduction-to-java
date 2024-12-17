/*
 * Write a Java program to detect whether a number entered by the user is integer or not.
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex06_Detect_Integer {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        System.out.println(sc.hasNextInt());

        sc.close();
    }
}
