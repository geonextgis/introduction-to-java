/*
 * This program demonstrates the use of a `do-while` loop in Java.
 * A `do-while` loop executes the block of code at least once and then repeatedly as long as the specified condition evaluates to `true`.
 */

 package code.JavaCourseCWH.src.codes;

 public class P015_To_Do_While_Loop {
     public static void main (String[] args) {
 
         /*
          * The `do-while` loop:
          * 1. The block of code inside the `do` block is executed **once**, even if the condition is `false`.
          * 2. After executing the code block, the condition `(b < 5)` is checked.
          * 3. If the condition is `true`, the loop repeats.
          * 4. If the condition is `false`, the loop terminates.
          */
 
         // Initialize the variable
         int b = 10;
 
         // Start of the `do-while` loop
         do {
             // Print the current value of `b`
             System.out.println(b);
 
             // Increment `b` by 1
             b++;
         } while (b < 5); // Loop continues if the condition `(b < 5)` is `true`
 
         /*
          * Explanation of execution:
          * - Step 1: The code inside the `do` block is executed. Since `b = 10`, it prints 10.
          * - Step 2: The value of `b` is incremented to 11.
          * - Step 3: The condition `(b < 5)` is checked. It evaluates to `false`, so the loop terminates.
          */
 
         /*
          * Key Characteristics of a `do-while` loop:
          * 1. It is an **exit-controlled loop**, meaning the condition is checked after the loop body is executed.
          * 2. The loop body is guaranteed to execute **at least once**, regardless of whether the condition is `true` or `false`.
          */
 
         /*
          * Output:
          * The loop prints:
          * 10
          */
     }
 }
 