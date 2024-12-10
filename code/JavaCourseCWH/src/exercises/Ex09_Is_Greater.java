/*
 * Use comparison operators to find out whether a given number is greater than the user entered number or not
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex09_Is_Greater {
    public static void main (String[] args) {
        float given_number = 50;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        float user_input = sc.nextFloat();

        boolean is_greater = user_input > given_number;
        System.out.println(is_greater);
    }
}
