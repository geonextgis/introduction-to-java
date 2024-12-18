/*
 * Write a Java program to find maximum element in an array
 */

package code.JavaCourseCWH.src.exercises;

public class Ex40_Find_Maximum_in_Array {
    public static void main (String[] args) {

        int[] arr = {17, 68, 54, 56, 71, 98, 65};
        int max = Integer.MIN_VALUE;

        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }

        System.out.println("The maximum value in the array is: " + max);
    }
}
