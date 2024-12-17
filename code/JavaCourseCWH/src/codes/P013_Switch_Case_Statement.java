/*
 * This program demonstrates the use of the `switch` statement in Java.
 * A `switch` statement is an alternative to using multiple `if-else` conditions.
 * It allows the program to execute one block of code based on the value of a variable or expression.
 */

 package code.JavaCourseCWH.src.codes;
 import java.util.Scanner;
 
 public class P013_Switch_Case_Statement {
     public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();

        // if (age > 56) {
        //     System.out.println("You are experienced!");
        // }

        // else if (age > 46) {
        //     System.out.println("You are semi-experienced!");
        // }

        // else if (age > 36) {
        //     System.out.println("You are semi-semi-experienced!");
        // }

        // else {
        //     System.out.println("You are not experienced.");
        // }
 
        /*
         * Switch-case structure:
         * 1. The `switch` keyword evaluates the value of the variable `age`.
         * 2. Each `case` specifies a potential value of `age`.
         * 3. The `break` statement ensures that the control exits the switch block after executing the matching case.
         * 4. The `default` case is executed if none of the specified `case` values match the variable's value.
         */
        switch (age) {
            case 18:
                System.out.println("You are going to become an Adult!");
                break; // Exits the switch block after executing this case
 
            case 23:
                System.out.println("You are going to join a Job!");
                break; // Exits the switch block after executing this case
 
            case 60:
                System.out.println("You are going to get retired!");
                break; // Exits the switch block after executing this case
 
            default:
                /*
                 * The `default` case:
                 * - This block is executed if none of the `case` values match the variable's value.
                 * - It acts as a fallback option.
                 */
                System.out.println("Enjoy your life!");
        }
    }
 }
 
/*
 * Key Points about the `switch` Statement:
 * 1. A `switch` evaluates the value of a variable or expression and compares it with the specified `case` values.
 * 2. The `case` values must be constants or literals (not variables or expressions).
 * 3. The `break` statement prevents fall-through, which means other cases won't execute after a match.
 * 4. If no matching case is found, the `default` block is executed.
 * 5. The `default` block is optional but recommended for handling unexpected values.
 
 * Example Scenarios:
 * - If `age` is 18:
 *   The output will be: "You are going to become an Adult!"
 * - If `age` is 23:
 *   The output will be: "You are going to join a Job!"
 * - If `age` is 60:
 *   The output will be: "You are going to get retired!"
 * - For any other `age`, the output will be: "Enjoy your life!"
 */
 