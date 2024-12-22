/*
 * Write a Java method to print multiplication table of a number n.
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex44_Multiplication_Table_Method {

    static void multiplication_table(int n) {

        for (int i=1; i<11; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }

    public static void main (String[] args) {

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();  

        System.out.println("Multiplication table of " + n + ":");
        multiplication_table(n);
    }
}
