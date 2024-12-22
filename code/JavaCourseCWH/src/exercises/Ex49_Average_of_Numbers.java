/*
 * Write a function to find average of a set of numbers passed as arguments
 */

package code.JavaCourseCWH.src.exercises;

public class Ex49_Average_of_Numbers {

    static float average (float ...numbers) {
        int sum = 0;

        for (float element: numbers) {
            sum += element;
        }

        return sum / numbers.length;
    }

    public static void main (String[] args) {

        System.out.println("The average of 1, 2, 3, 4, and 5 is: " + average(1, 2, 3, 4, 5));
    }
}
