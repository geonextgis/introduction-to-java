/*
 * Write a java program to detect double and triple spaces in a string
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex15_Detect_Double_and_Triple_Spaces {
    public static void main (String[] args) {
        
        System.out.println("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        String user_string = sc.nextLine();

        System.out.println("The string contains double space at index: " + user_string.indexOf("  "));
        System.out.println("The string contains triple space at index: " + user_string.indexOf("   "));
    }
}
