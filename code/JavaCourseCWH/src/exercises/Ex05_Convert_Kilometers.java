/*
 * Write a Java program to convert kilometers to miles
 */


package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;


public class Ex05_Convert_Kilometers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the distance in kilometers:");
        float distance_km = sc.nextFloat();
        sc.close();
        
        float distance_miles = distance_km / 1.609f;

        System.out.println("The distance in miles is:");
        System.out.println(distance_miles);   
    }
}
