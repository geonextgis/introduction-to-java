/*
 * Write a program using functions to print the following pattern
 * *
 * **
 * ***
 * ****
 */

package code.JavaCourseCWH.src.exercises;

public class Ex45_Print_Pattern_Methods {

    static void print_pattern () {
        for (int i=1; i<=4; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        print_pattern();
    }
}
