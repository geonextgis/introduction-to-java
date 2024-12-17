/*
 * Write a Java program to fill in a letter template which looks like below:
 * letter = "Dear <name>, Thanks a lot"
 * Replace <name> with a string
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex14_Letter_Template {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String user_name = sc.nextLine();
        sc.close();

        System.out.format("Dear %s, Thanks a lot.", user_name);
    }
}
