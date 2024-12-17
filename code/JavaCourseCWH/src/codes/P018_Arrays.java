/*
 * Arrays in Java:
 * Arrays are used to store multiple values of the same data type in a single variable.
 * Arrays are indexed, starting from 0, and provide a way to group elements efficiently.
 */

 package code.JavaCourseCWH.src.codes;

 public class P018_Arrays {
     public static void main(String[] args) {
 
         // 1. Array Declaration
         // Here, we declare an array 'marks' that will store integers.
         // However, memory is not allocated yet.
         // int[] marks;
 
         /*
          * 2. Array Declaration + Memory Allocation:
          * We declare the array 'marks' and allocate memory for 5 integers.
          * The size of the array is fixed during allocation.
          */
         // int[] marks = new int[5]; // Array with 5 elements (default initialized to 0)
         
         // Assigning values to the array elements using their index:
         // marks[0] = 100; // Element at index 0
         // marks[1] = 60;  // Element at index 1
         // marks[2] = 85;  // Element at index 2
         // marks[3] = 92;  // Element at index 3
         // marks[4] = 76;  // Element at index 4
 
         /*
          * Important Note:
          * - Index values start from 0.
          * - Trying to access an index outside the array's size will throw an "ArrayIndexOutOfBoundsException".
          * For example:
          * marks[6] = 80; // This will cause an error because the size of the array is 5.
          */
 
         /*
          * 3. Array Declaration + Initialization:
          * We can declare and initialize an array in a single step.
          * This is more concise and avoids assigning values individually.
          */
         int[] marks = {100, 60, 85, 92, 76}; // Array of size 5 with initialized values
 
         /*
          * Accessing Array Elements:
          * - Array elements are accessed using their index.
          * - Use marks[index] to access a specific element.
          */
         System.out.println("The element at index 4 is: " + marks[4]); // Access the value at index 4
 
         /*
          * Key Points about Arrays in Java:
          * - Arrays have a fixed size once created.
          * - Arrays are stored in contiguous memory locations.
          * - Arrays can hold primitive data types (int, float, char, etc.) or objects.
          * - Use 'length' property to find the size of the array: marks.length.
          */
     }
 }
 