/*
 * Write a program to replace spaces with underscore
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex13_Replace_Spaces {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String user_input = sc.nextLine();
        sc.close();

        String modified_input = user_input.replace(' ', '_');
        System.out.println("The modified string: " + modified_input);
    }
}
