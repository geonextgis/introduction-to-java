/*
 * Write a Java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
 */

 
 package code.JavaCourseCWH.src.exercises;

 public class Ex08_Encrypt_Grade {
     public static void main (String[] args) {
         // Step 1: Initialize the grade
         // 'B' is a character with an ASCII value of 66.
         char grade = 'B';
         
         // Step 2: Encrypt the grade
         /*
          * The encryption is done by adding 8 to the ASCII value of the grade.
          * For example:
          * - Original grade: 'B' (ASCII: 66)
          * - Encrypted grade: 66 + 8 = 74
          * - The character corresponding to ASCII 74 is 'J'.
          */
         grade = (char)(grade + 8);
         System.out.println("Encrypted Grade: " + grade); // Output: Encrypted Grade: J
 
         // Step 3: Decrypt the grade
         /*
          * The decryption is performed by subtracting 8 from the ASCII value of the encrypted grade.
          * For example:
          * - Encrypted grade: 'J' (ASCII: 74)
          * - Decrypted grade: 74 - 8 = 66
          * - The character corresponding to ASCII 66 is 'B'.
          */
         grade = (char)(grade - 8);
         System.out.println("Decrypted Grade: " + grade); // Output: Decrypted Grade: B
     }
 }
 