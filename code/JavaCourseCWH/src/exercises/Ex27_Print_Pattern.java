/*
 * Write a program to print the following pattern
 * ****
 * ***
 * **
 * *
 */

package code.JavaCourseCWH.src.exercises;

public class Ex27_Print_Pattern {
    public static void main (String[] args) {

        for (int i=4; i>0; i--) {
            
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
    }
}
