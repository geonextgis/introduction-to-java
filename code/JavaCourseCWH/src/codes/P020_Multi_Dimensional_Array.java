/*
 * Explanation of Multidimensional Arrays in Java:
 * - Java supports arrays with more than one dimension (e.g., 2D arrays).
 * - A multidimensional array is essentially an array of arrays.
 * - These arrays can store data in a tabular or matrix-like structure.
 */

 package code.JavaCourseCWH.src.codes;

 public class P020_Multi_Dimensional_Array {
     public static void main(String[] args) {
 
         /*
          * Declaring Arrays:
          * - A 1-D array stores a list of elements in a single row.
          * - A 2-D array stores elements in rows and columns.
          */
        //  int[] marks;      // A 1-D Array
         int[][] flats;    // A 2-D Array (Declaration)
 
         /*
          * Memory Allocation for 2-D Array:
          * - Use the 'new' keyword to allocate memory for the array.
          * - The size [2][3] means the array has 2 rows and 3 columns.
          */
         flats = new int[2][3]; // Creates a 2x3 2-D array
 
         /*
          * Assigning Values:
          * - Access each element using row and column indices.
          * - Example: flats[0][0] refers to the element at row 0, column 0.
          */
         flats[0][0] = 101;
         flats[0][1] = 102;
         flats[0][2] = 103; // Assigns 101, 102, 103 to the first row
         flats[1][0] = 201;
         flats[1][1] = 202;
         flats[1][2] = 203; // Assigns 201, 202, 203 to the second row
 
         /*
          * Displaying the 2-D Array using Nested Loops:
          * - The outer loop iterates over rows.
          * - The inner loop iterates over columns within each row.
          * - Use 'flats.length' to get the number of rows.
          * - Use 'flats[i].length' to get the number of columns in row 'i'.
          */
         System.out.println("Printing a 2-D array using for loop:");
         for (int i = 0; i < flats.length; i++) {         // Iterate over rows
             for (int j = 0; j < flats[i].length; j++) {  // Iterate over columns in row 'i'
                 System.out.print(flats[i][j]);          // Print each element
                 System.out.print(" ");                  // Add a space between elements
             }
             System.out.println(""); // Move to the next row after printing all columns
         }
     }
 }
 