/*
 * Rock, Paper, and Scissors Game
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Random;
import java.util.Scanner;


public class Ex23_Rock_Paper_Scissors {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Select your choice:\n\t'0' for 'Rock'\n\t'1' for 'Paper'\n\t'2' for 'Scissors'");
        int user_choice = sc.nextInt();

        System.out.println("Turn for Computer...");
        int comp_choice = random.nextInt(3);
        
        System.out.println("Computer Choice: " + comp_choice + "\t User Choice: " + user_choice);

        if (user_choice == comp_choice) {
            System.out.println("Match Drawn");
        }

        else if ((user_choice==1) && (comp_choice==0)) {
            System.out.println("User wins!");
        }

        else if ((user_choice==0) && (comp_choice==2)) {
            System.out.println("User wins!");
        }

        else if ((user_choice==2) && (user_choice==1)) {
            System.out.println("User wins!");
        }

        else {
            System.out.println("Computer Wins!");
        }
    }
}
