/*
 * What will be the result of the following expression
 * float a = 7 / 4 * 9 / 2
 */

 package code.JavaCourseCWH.src.exercises;

 public class Ex07_Expression_Result {
     public static void main (String[] args) {
         // Explanation of the expression: 7 / 4 * 9 / 2
         
         /*
          * Step 1: Operators and Precedence
          * - The expression contains the arithmetic operators '/' (division) and '*' (multiplication).
          * - Both '/' and '*' have the same precedence.
          * - When operators have the same precedence, they are evaluated from left to right 
          *   (left-to-right associativity).
          */
 
         // Step 2: Type of Division
         /*
          * - In Java, the numbers 7, 4, 9, and 2 are all integers.
          * - When performing arithmetic with integers, the result is also an integer.
          * - Integer division truncates the decimal part (e.g., 7 / 4 = 1, not 1.75).
          */
 
         float a = 7 / 4 * 9 / 2; // The expression is evaluated as follows:
         
         /*
          * Step 3: Evaluate the Expression
          * - 7 / 4 = 1 (integer division)
          * - 1 * 9 = 9
          * - 9 / 2 = 4 (integer division)
          * 
          * The final value of `a` is 4 (as the entire calculation is done using integers).
          */
 
         System.out.println(a); // Prints: 4.0
 
         /*
          * Note:
          * - Even though `a` is a float, the calculation is performed using integers first, 
          *   and the result (4) is then converted to a float (4.0).
          * - To get an accurate result with decimal values, at least one operand in the 
          *   expression should be a float or double, for example:
          *   float a = 7f / 4 * 9 / 2;
          */
     }
 }
 