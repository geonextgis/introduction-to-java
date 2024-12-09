/*
 * Exercise: 1.1
 * Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects
 * must be taken as input from the keyboard. (Marks are out of 100)
 */


package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex01_CBSE_Board_Percentage_Calculator {
    public static void main (String[] args) {
        
        int total_score = 500;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the score in Mathematics:");
        float score_in_mathematics = sc.nextFloat();

        System.out.println("Enter the score in Physics:");
        float score_in_physics = sc.nextFloat();

        System.out.println("Enter the score in Chemistry:");
        float score_in_chemistry = sc.nextFloat();

        System.out.println("Enter the score in History:");
        float score_in_history = sc.nextFloat();

        System.out.println("Enter the score in Geography:");
        float score_in_geography = sc.nextFloat();

        float sum_of_scores = score_in_mathematics + score_in_physics + score_in_chemistry + score_in_history + score_in_geography;

        float percentage = sum_of_scores / total_score;
        System.out.print("The percentage is: ");
        System.out.println(percentage);
    }
}
