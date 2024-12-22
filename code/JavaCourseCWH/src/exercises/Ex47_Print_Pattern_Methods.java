/*
 * Write a function to print the following pattern
 * ****
 * ***
 * **
 * *
 */


package code.JavaCourseCWH.src.exercises;

public class Ex47_Print_Pattern_Methods {

    static void print_pattern() {
        for (int i=4; i>0; i--) {
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
