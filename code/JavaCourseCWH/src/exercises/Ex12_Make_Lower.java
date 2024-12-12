/*
 * Write a program to convert a string to lowercase
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex12_Make_Lower {
    public static void main (String[] args) {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to convert to lowercase:");
        String user_input = sc.nextLine(); // Reads the user input

        // Convert the user input to lowercase
        String user_input_lower = user_input.toLowerCase();

        // Display the result
        System.out.println("Lowercase version of input: " + user_input_lower);

        // Close the scanner to release resources
        sc.close();
    }
}
