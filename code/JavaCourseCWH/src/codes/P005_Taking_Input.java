package code.JavaCourseCWH.src.codes;
import java.util.Scanner;

public class P005_Taking_Input {
    public static void main (String[] args) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();
        // float num1 = sc.nextFloat();
        // boolean b1 = sc.hasNextInt();
        
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();
        // float num2 = sc.nextFloat();
        // boolean b2 = sc.hasNextInt();

        int sum = num1 + num2;
        
        System.out.println("Enter a string:");
        String str = sc.next();
        // String str2 = sc.nextLine();

        System.out.println("The sum of these two number is:");
        System.out.println(sum);
        System.out.println(str);
    }
}


/*
 * This Java program demonstrates how to take user input using the `Scanner` class.
 * 
 * Key Features of the Program:
 * 
 * 1. Importing the Scanner Class:
 *    - The `java.util.Scanner` class is imported to allow user input.
 * 
 * 2. Creating a Scanner Object:
 *    - Scanner sc = new Scanner(System.in);
 *      This creates a `Scanner` object `sc` that reads input from the standard input stream (keyboard).
 * 
 * 3. Taking Float Input:
 *    - float num1 = sc.nextFloat(); (Reads a floating-point number entered by the user)
 *    - float num2 = sc.nextFloat(); (Reads another floating-point number entered by the user)
 * 
 * 4. Checking if the Input is an Integer:
 *    - boolean b1 = sc.hasNextInt(); (Checks if the next input is an integer and stores the result in `b1`)
 *    - boolean b2 = sc.hasNextInt(); (Similar check for the next input, stored in `b2`)
 * 
 * 5. Calculating the Sum:
 *    - float sum = num1 + num2; (Calculates the sum of the two floating-point numbers)
 * 
 * 6. Reading Strings:
 *    - String str = sc.next(); (Reads the next token/word entered by the user)
 *    - String str2 = sc.nextLine(); (Reads the remainder of the current line, if any)
 *      Note: `sc.nextLine()` may behave unexpectedly when used immediately after `sc.next()` or other non-line-based input methods.
 * 
 * 7. Printing Results:
 *    - Outputs the sum of the two numbers and the entered strings using `System.out.println()`.
 * 
 * Notes:
 * - Uncommenting the `int num1` and `int num2` lines will allow integer input instead of floating-point input.
 * - Always close the `Scanner` object with `sc.close();` when it's no longer needed to prevent resource leaks (not shown here).
 */
