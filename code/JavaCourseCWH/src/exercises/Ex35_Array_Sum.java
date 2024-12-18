/*
 * Create an array of 5 floats and calculate their sum
 */

package code.JavaCourseCWH.src.exercises;

public class Ex35_Array_Sum {
    public static void main (String[] args) {

        float[] arr = {5.6f, 7.9f, 9.8f, 6.5f, 8.0f};

        float sum = 0.0f;

        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of all the values: " + sum);
    }
}