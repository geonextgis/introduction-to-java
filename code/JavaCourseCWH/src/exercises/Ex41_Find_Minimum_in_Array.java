/*
 * Write a Java program to find minimum element in an array
 */


package code.JavaCourseCWH.src.exercises;

public class Ex41_Find_Minimum_in_Array {

    public static void main (String[] args) {

        int[] arr = {17, 68, 54, 56, 71, 98, 65};
        int min = Integer.MAX_VALUE;

        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }

        System.out.println("The minimum value in the array is: " + min);
    }
}