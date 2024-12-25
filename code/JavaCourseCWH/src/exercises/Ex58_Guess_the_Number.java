/*
 * Create a class Game, which allows a user to play "Guess the Number" game once. Game should have the following methods:
 * 1. Constructor to generate the random number
 * 2. takeUserInput() to take a user input of number
 * 3. isCorrectNumber() to detect whether the number entered by the user is true
 * 4. getter and setter for noOfGuesses
 * Use properties such as noOfGuesses(int), etc to get this task done!
 */


package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;
import java.util.Random;


class Game {
    int user_num;
    Scanner sc = new Scanner(System.in);
    private int no_of_guess = 0;

    Random r = new Random();
    private int comp_num = r.nextInt(100);

    public void takeUserInput() {
        System.out.format("Guess-%d, Enter your number: ", no_of_guess+1);
        user_num = sc.nextInt();
        System.out.println("User input taken.");
    }

    public boolean isCorrectNumber() {

        no_of_guess ++;

        if (comp_num == user_num) {
            System.out.println("Congratulation! you guessed the correct number.");
            return true;
        }

        else if (comp_num > user_num) {
            System.out.println("Wrong! your guessed number is smaller.");
            return false;
        }

        else {
            System.out.println("Wrong! your guessed number is greater.");
            return false;
        }
    }

    public int getGuess() {
        return no_of_guess;
    }
}

public class Ex58_Guess_the_Number {

    public static void main(String[] args) {

        System.out.println("Starting 'Guess the Number' Game...");

        Game game = new Game();
        game.takeUserInput();

        while (game.isCorrectNumber()==false) {
            game.takeUserInput();
        }

        System.out.format("You took %d guesses.", game.getGuess());
    }
}
