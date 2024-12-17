/*
 * Write a program to calculate the sum of the numbers occuring in the multiplication table of 8
 */

package code.JavaCourseCWH.src.exercises;

public class Ex34_Multiplication_Table_Sum {
    public static void main (String[] args) {

        int sum = 0;

        for (int i=1; i<=10; i++) {
            sum += (i * 8);
        }

        System.out.println("The value is: " + sum);
    }
}
