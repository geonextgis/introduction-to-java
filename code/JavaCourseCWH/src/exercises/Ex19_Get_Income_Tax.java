/*
 * Calculate income tax paid by an employee to the government as per the slabs mentioned below:
 * 
 * Income Slab       Tax
 * 2.5L - 5.0L       5%
 * 5.0L - 10.0L      20%
 * Above 10.0L       30%
 * 
 * Note that there is no tax below 2.5L. Take input amount as an input from the user.
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex19_Get_Income_Tax {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income slab: ");
        int user_income_slab = sc.nextInt();

        if (user_income_slab <= 2.5e5) {
            System.out.println("You don't have to pay any taxes.");
        }

        else if ((user_income_slab > 2.5e5) && (user_income_slab <= 5e5)) {
            System.out.println("Your have to pay " + (int)((user_income_slab)*(0.05)) + " rupees as taxes.");
        }

        else if ((user_income_slab > 5e5) && (user_income_slab <= 1e6)) {
            System.out.println("Your have to pay " + (int)((user_income_slab)*(0.2)) + " rupees as taxes.");
        }

        else {
            System.out.println("Your have to pay " + (int)((user_income_slab)*(0.3)) + " rupees as taxes.");
        }
    }
}
