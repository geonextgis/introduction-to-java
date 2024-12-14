/*
 * Write a Java program to find out the day of the week given the number [1 for Monday,
 * 2 for Tuesday, ..., and so on!]
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex20_Day_of_Week {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day of the week in number: ");
        int day_of_week = sc.nextInt();

        switch (day_of_week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valida number.");
                break;
        }
    }
}
