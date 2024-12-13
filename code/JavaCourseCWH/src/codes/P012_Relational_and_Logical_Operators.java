/*
 * This program demonstrates the use of logical operators in Java.
 * Logical operators are used to combine multiple boolean expressions
 * or to reverse the logic of an expression.
 */

 package code.JavaCourseCWH.src.codes;

 public class P012_Relational_and_Logical_Operators {
     public static void main (String[] args) {
         // Demonstration of Logical AND (&&) operator
         System.out.println("For Logical AND:");
         boolean a = true;  // First condition
         boolean b = false; // Second condition
         boolean c = true;  // Third condition
 
         /*
          * The Logical AND (&&) operator evaluates to true only if all conditions are true.
          * If any one condition is false, the result is false.
          */
         if (a && b && c) {
             System.out.println("True"); // Executes if all conditions are true
         } else {
             System.out.println("False"); // Executes if any condition is false
         }
 
         // Demonstration of Logical OR (||) operator
         System.out.println("For Logical OR:");
         /*
          * The Logical OR (||) operator evaluates to true if at least one condition is true.
          * It evaluates to false only if all conditions are false.
          */
         if (a || b) {
             System.out.println("True"); // Executes if at least one condition is true
         } else {
             System.out.println("False"); // Executes if all conditions are false
         }
 
         // Demonstration of Logical NOT (!) operator
         System.out.println("For Logical NOT:");
         /*
          * The Logical NOT (!) operator reverses the value of a boolean expression.
          * If the value is true, it becomes false, and vice versa.
          */
         System.out.print("Not(A) is: ");
         System.out.println(!a); // Prints the negated value of 'a'
 
         System.out.print("Not(B) is: ");
         System.out.println(!b); // Prints the negated value of 'b'
     }
 }
 
 /*
  * Key Concepts of Logical Operators:
  * 1. Logical AND (&&):
  *    - Combines multiple conditions.
  *    - Returns true only if all conditions are true.
  * 
  * 2. Logical OR (||):
  *    - Combines multiple conditions.
  *    - Returns true if at least one condition is true.
  * 
  * 3. Logical NOT (!):
  *    - Reverses the logic of a boolean expression.
  *    - Returns true if the condition is false, and false if the condition is true.
  * 
  * Example Scenarios:
  * - For Logical AND:
  *   a = true, b = false, c = true
  *   Result: False (because b is false)
  * 
  * - For Logical OR:
  *   a = true, b = false
  *   Result: True (because a is true)
  * 
  * - For Logical NOT:
  *   a = true
  *   Result: Not(A) is: false
  */
 