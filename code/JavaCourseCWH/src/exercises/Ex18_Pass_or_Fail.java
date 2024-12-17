/*
 * Write a program to find out whether a student is pass or fail; if it requires total 40%
 * and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from
 * the user.
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex18_Pass_or_Fail {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the maximum mark in each subject: ");
        float max_score = sc.nextFloat();

        System.out.print("Enter your marks in Mathematics: ");
        float math_score = sc.nextFloat();

        System.out.print("Enter your marks in Physics: ");
        float physics_score = sc.nextFloat();

        System.out.print("Enter your marks in Chemistry: ");
        float chemistry_score = sc.nextFloat();
        sc.close();

        float total_percentage = ((math_score + physics_score + chemistry_score)/(max_score*3)) * 100;

        boolean cond = ((math_score > 33) && (physics_score > 33) && (chemistry_score > 33) && (total_percentage > 40));

        if (cond) {
            System.out.println("You are passed.");
        }

        else {
            System.out.println("You are failed.");
        }
    }
}
