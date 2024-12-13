/*
 * This program demonstrates the use of conditional statements (if-else) in Java.
 * Conditional statements allow you to execute different blocks of code based on specific conditions.
 */

 package code.JavaCourseCWH.src.codes;

 public class P011_Conditionals {
     public static void main (String[] args) {
         // Declaring an integer variable 'age' and assigning it a value
         int age = 36;
 
         /*
          * The 'if' statement checks whether the condition (age > 18) is true.
          * If the condition is true, the code inside the 'if' block is executed.
          * Otherwise, the code inside the 'else' block is executed.
          */
         if (age > 18) {
             // This block executes if 'age' is greater than 18
             System.out.println("Yes boy, you can drive!");
         }
 
         // The 'else' block provides an alternative set of instructions
         // when the 'if' condition is not met (i.e., age <= 18)
         else {
             System.out.println("No boy, you cannot drive yet.");
         }
     }
 }
 
 /*
  * Explanation of Key Concepts:
  * 1. 'if' Statement:
  *    - Used to check a condition.
  *    - If the condition evaluates to true, the statements inside the 'if' block are executed.
  * 
  * 2. 'else' Statement:
  *    - Provides an alternate set of instructions when the 'if' condition is false.
  *    - The 'else' block is optional and can be omitted if no alternative action is needed.
  * 
  * Execution Flow:
  * - In this program, if the 'age' variable is greater than 18, the program prints:
  *   "Yes boy, you can drive!"
  * - Otherwise, it prints:
  *   "No boy, you cannot drive yet."
  * 
  * Example Scenarios:
  * - If age = 20, the output will be:
  *   Yes boy, you can drive!
  * 
  * - If age = 15, the output will be:
  *   No boy, you cannot drive yet.
  */
 