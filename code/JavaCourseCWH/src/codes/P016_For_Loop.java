/*
 * This program demonstrates the use of a `for` loop in Java.
 * A `for` loop is a control flow statement used to repeatedly execute a block of code 
 * as long as the specified condition evaluates to `true`.
 */

 package code.JavaCourseCWH.src.codes;

 public class P016_For_Loop {
     public static void main (String[] args) {
 
         /*
          * Syntax of a `for` loop:
          * for (initialization; condition; update) {
          *     // Code to be executed repeatedly
          * }
          *
          * 1. **Initialization**: Sets the starting value of the loop control variable (`i = 1` in this case).
          *    It is executed only once at the start of the loop.
          *
          * 2. **Condition**: Evaluates before every iteration. If it evaluates to `true`, the loop body is executed.
          *    If it evaluates to `false`, the loop terminates.
          *
          * 3. **Update**: Executes after each iteration of the loop body, typically updating the loop control variable (`i++`).
          *
          * In this example:
          * - Initialization: `int i = 1` (starts with `i = 1`).
          * - Condition: `i <= 10` (loop runs as long as `i` is less than or equal to 10).
          * - Update: `i++` (increments `i` by 1 after each iteration).
          */
 
         for (int i = 1; i <= 10; i++) {
             // Print the current value of `i` in each iteration
             System.out.println(i);
         }
 
         /*
          * Explanation of Execution:
          * - Step 1: `i` is initialized to 1.
          * - Step 2: The condition `i <= 10` is checked. If true, the loop body is executed.
          * - Step 3: The current value of `i` is printed.
          * - Step 4: The update `i++` increments `i` by 1.
          * - Steps 2-4 are repeated until `i > 10` (condition becomes false).
          *
          * Output:
          * The numbers 1 to 10 are printed, one on each line:
          * 1
          * 2
          * 3
          * 4
          * 5
          * 6
          * 7
          * 8
          * 9
          * 10
          *
          * Characteristics of a `for` loop:
          * - It is a **entry-controlled loop**. The condition is checked before executing the loop body.
          * - It is commonly used when the number of iterations is known beforehand.
          */
     }
 }
 