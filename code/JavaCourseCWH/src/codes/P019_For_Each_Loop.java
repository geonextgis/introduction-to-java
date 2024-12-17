/*
 * Displaying Arrays and For-Each Loop in Java:
 * - Arrays can be displayed using regular 'for' loops or the enhanced 'for-each' loop.
 * - The 'for-each' loop simplifies iteration over arrays and collections.
 */

 package code.JavaCourseCWH.src.codes;

 public class P019_For_Each_Loop {
     public static void main(String[] args) {
 
         /*
          * Array Initialization:
          * - The 'marks' array stores float values.
          * - The 'names' array stores string values.
          */
         float[] marks = {87.5f, 92.5f, 80.0f, 78.5f, 96.5f}; // Float array
         String[] names = {"Krish", "Anirban", "Abir"};       // String array
         
         /*
          * Accessing Array Elements:
          * - Individual elements are accessed using their index.
          */
         System.out.println("Element at index 4 in marks: " + marks[4]); // Prints the value at index 4
         System.out.println("Element at index 2 in names: " + names[2]); // Prints the value at index 2
         
         /*
          * Array Length:
          * - Use the 'length' property to get the total number of elements in the array.
          */
         System.out.println("Length of names array: " + names.length); // Prints the size of the names array
 
         /*
          * Displaying Array Elements using a Regular 'for' Loop:
          * - The 'for' loop iterates over the array using an index.
          * - Ensure the loop index remains within bounds to avoid ArrayIndexOutOfBoundsException.
          */
         System.out.println("Displaying marks using regular for loop:");
         for (int i = 0; i < marks.length; i++) { // Loop from index 0 to marks.length-1
             System.out.println(marks[i]);       // Print each array element
         }
 
         /*
          * Displaying Array Elements in Reverse Order:
          * - Start the loop from the last index and decrement the counter.
          */
         System.out.println("Displaying marks in reverse order:");
         for (int i = marks.length - 1; i >= 0; i--) { // Start from marks.length-1
             System.out.println(marks[i]);            // Print array elements in reverse
         }
 
         /*
          * For-Each Loop (Enhanced For Loop):
          * - The for-each loop iterates over each element of the array directly.
          * - It does not use indexes, making the code cleaner and less error-prone.
          * Syntax:
          *   for (dataType variable : arrayName) {
          *       // Code block
          *   }
          */
         System.out.println("Displaying marks using for-each loop:");
         for (float element : marks) { // Iterate over each float element in 'marks'
             System.out.println(element); // Print the current element
         }
 
         /*
          * Key Points about For-Each Loop:
          * - It is simpler to use when you don't need the index.
          * - It avoids the risk of index errors.
          * - However, it does not allow modifying array elements during iteration.
          */
     }
 }
 