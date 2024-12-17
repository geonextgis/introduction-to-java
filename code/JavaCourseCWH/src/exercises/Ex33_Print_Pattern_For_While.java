/*
 * Write a program to print the following pattern using For/While loop
 * ****
 * ***
 * **
 * *
 */

package code.JavaCourseCWH.src.exercises;

public class Ex33_Print_Pattern_For_While {
    public static void main (String[] args) {

        int i = 4;
        
        while (i>0) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();

            i--;
        }
    }
}
