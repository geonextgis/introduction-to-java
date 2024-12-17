/*
 * Write a program to find out the type of website from the URL
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex22_Website_Type {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the URL: ");
        String url = sc.next();
        sc.close();

        if (url.endsWith(".com")) {
            System.out.println("It's a Commercial Website");
        }

        else if (url.endsWith(".org")) {
            System.out.println("It's a Organisation Website");
        }

        else if (url.endsWith(".in")) {
            System.out.println("It's an Indian Website");
        }

        else {
            System.out.println("Unable to identify");
        }
    }
}
