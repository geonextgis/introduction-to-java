/*
 * Write a Java program to reverse an array
 * 
 * This program demonstrates how to reverse an array in Java.
 * The array is reversed in place, meaning no additional array is created.
 * The code uses a loop to swap elements symmetrically from both ends of the array.
 */
 
package code.JavaCourseCWH.src.exercises;

public class Ex39_Array_Reverse {
    public static void main(String[] args) {

        // Step 1: Initialize an array
        int[] arr = {1, 2, 3, 4, 5}; // Original array
        int l = arr.length;          // Length of the array
        int n = Math.floorDiv(arr.length, 2); // Calculate the midpoint of the array
        // Math.floorDiv performs integer division, equivalent to arr.length / 2
        int temp; // Temporary variable used for swapping elements

        /*
         * Step 2: Reverse the array
         * - Iterate from the start of the array up to its midpoint.
         * - Swap the element at position `i` with the element at position `l-i-1`.
         */
        for (int i = 0; i < n; i++) {
            temp = arr[i];               // Store the current element in `temp`
            arr[i] = arr[l - i - 1];     // Replace the element at `i` with its counterpart
            arr[l - i - 1] = temp;       // Assign the stored value to the counterpart position
        }

        /*
         * Step 3: Display the reversed array
         * - Use a for-each loop to iterate through the array and print its elements.
         */
        for (int element : arr) {
            System.out.print(element + " "); // Print each element, separated by a space
        }
    }
}