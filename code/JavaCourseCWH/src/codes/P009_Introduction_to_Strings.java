/*
 * Introduction to Strings in Java
 * 
 * Strings are objects in Java that represent a sequence of characters. They are a part of the `java.lang` package.
 * Java provides two primary ways to create strings:
 * 
 * 1. Using string literals: 
 *    - Example: `String name = "Krishnagopal Halder";`
 *    - Strings created this way are stored in the String Pool for memory efficiency.
 * 
 * 2. Using the `new` keyword:
 *    - Example: `String name = new String("Krishnagopal Halder");`
 *    - This creates a new string object in the heap memory.
 */

 package code.JavaCourseCWH.src.codes;
 import java.util.Scanner;
 
 public class P009_Introduction_to_Strings {
     public static void main (String[] args) {
         // Creating a string using a string literal
         // This approach uses the String Pool.
         String name = "Krishnagopal Halder";
         System.out.print("The name is: "); 
         System.out.println(name); // Output: The name is: Krishnagopal Halder
 
         // Demonstrating formatted output using `printf` and `format`
         int a = 6;
         float b = 5.6454f;
         /*
          * `printf` and `format` are used for formatted output.
          * %d is used for integers.
          * %f is used for floating-point numbers.
          */
         System.out.printf("The value of a is %d and value of b is %f", a, b); 
         System.out.format("The value of a is %d and value of b is %f", a, b); 
 
         // Reading a string from the user using `Scanner`
         Scanner sc = new Scanner(System.in);
         /*
          * `nextLine` reads the entire line entered by the user, including spaces.
          * The input string is stored in the variable `st`.
          */
         String st = sc.nextLine();
         sc.close();
         System.out.println(st); // Prints the input string
     }
 }
 