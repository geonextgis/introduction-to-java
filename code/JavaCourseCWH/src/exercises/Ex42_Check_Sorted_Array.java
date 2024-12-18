/*
 * Write a Java program to find whether an array is sorted or not
 */

package code.JavaCourseCWH.src.exercises;

public class Ex42_Check_Sorted_Array {
    public static void main (String[] args) {

        int[] arr = {6, 7, 5, 2, 10, 12};

        boolean isSorted = true;

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted.");
        }
        else {
            System.out.println("The array is not sorted.");
        }
    }

}
