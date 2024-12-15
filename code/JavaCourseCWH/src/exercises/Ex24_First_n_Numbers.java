
/*
 * Write a program to print first n natural numbers using do-while loop
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex24_First_n_Numbers {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a = 1;

        do {
            System.out.println(a);
            a++;
        }while (a <= n);
    }

}
