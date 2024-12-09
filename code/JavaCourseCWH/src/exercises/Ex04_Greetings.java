/*
 * Write a Java program which asks the user to enter his/her name and greets them with
 * "Hello <name>, have a good day" text
 */


package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;


public class Ex04_Greetings {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Hello " + name + ", have a good day.");
    }
}
