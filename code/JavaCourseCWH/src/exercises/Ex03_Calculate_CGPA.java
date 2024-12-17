/*
 * Write a program to calculate CGPA using marks of three subjects (out of 100).
 */

 
package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;


public class Ex03_Calculate_CGPA {
    public static void main (String[] args) {

        float total_marks = 300;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subject 1:");
        float marks_1 = sc.nextFloat();

        System.out.println("Enter the marks of subject 2:");
        float marks_2 = sc.nextFloat();

        System.out.println("Enter the marks of subject 3:");
        float marks_3 = sc.nextFloat();
        sc.close();

        float sum = marks_1 + marks_2 + marks_3;
        float cgpa = (sum / total_marks) * 10;

        System.out.print("The CGPA is:");
        System.out.println(cgpa);
    }
}
