/*
 * Write a program to print multiplication table of 10 in reverse order
 */

package code.JavaCourseCWH.src.exercises;

public class Ex30_Reverse_Multiplication_Table {
    public static void main (String[] args) {

        int n = 10;

        for (int i=10; i>0; i--) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}

