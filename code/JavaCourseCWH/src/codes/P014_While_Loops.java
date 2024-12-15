/*
 * This program demonstrates the use of a `while` loop in Java.
 * A `while` loop repeatedly executes a block of code as long as the specified condition evaluates to `true`.
 */

 package code.JavaCourseCWH.src.codes;

 public class P014_While_Loops {
     public static void main (String[] args) {
 
         // Initialize a counter variable
         int i = 1;
 
         /*
          * The `while` loop:
          * 1. The condition `(i <= 5)` is checked before executing the loop body.
          * 2. If the condition is `true`, the loop body is executed.
          * 3. The value of `i` is incremented by 1 using `i++` at the end of each iteration.
          * 4. The loop continues until the condition `(i <= 5)` becomes `false`.
          */
         while (i <= 5) {
             // Print the current value of `i`
             System.out.println(i);
 
             // Increment the value of `i` by 1
             i++;
         }
 
         /*
          * How the loop executes:
          * - Iteration 1: `i = 1`, condition `i <= 5` is `true`, prints 1, increments `i` to 2.
          * - Iteration 2: `i = 2`, condition `i <= 5` is `true`, prints 2, increments `i` to 3.
          * - Iteration 3: `i = 3`, condition `i <= 5` is `true`, prints 3, increments `i` to 4.
          * - Iteration 4: `i = 4`, condition `i <= 5` is `true`, prints 4, increments `i` to 5.
          * - Iteration 5: `i = 5`, condition `i <= 5` is `true`, prints 5, increments `i` to 6.
          * - Iteration 6: `i = 6`, condition `i <= 5` is `false`, exits the loop.
          */
 
         /*
          * Key Characteristics of a `while` loop:
          * 1. It is an **entry-controlled loop**, meaning the condition is checked before the loop body is executed.
          * 2. If the condition is `false` at the start, the loop body will not execute even once.
          * 3. Ensure the condition eventually becomes `false`; otherwise, the loop will run infinitely.
          */
 
         /*
          * Output:
          * The loop prints:
          * 1
          * 2
          * 3
          * 4
          * 5
          */
     }
 }
 