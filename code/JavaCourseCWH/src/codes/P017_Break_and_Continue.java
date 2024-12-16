package code.JavaCourseCWH.src.codes;

public class P017_Break_and_Continue {
    public static void main (String[] args) {

        // Break statement in a For loop:
        // --------------------------------
        // The "break" statement is used to exit the loop prematurely.
        // In this example, the loop prints numbers from 0 to 4.
        // However, when the value of `i` is 2, the "break" statement terminates the loop.
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // Print the value of `i`.
            System.out.println("Java is great!");

            // Check if `i` is equal to 2
            if (i == 2) {
                System.out.println("Ending the loop."); // Indicate the loop termination.
                break; // Exit the loop.
            }
        }

        // Break statement in a While loop:
        // ----------------------------------
        // The "break" statement works similarly in a while loop.
        // When `i == 2`, the loop terminates before it completes all iterations.
        int i = 0; // Initialize `i` to 0.

        while (i < 5) {
            System.out.println(i); // Print the value of `i`.
            System.out.println("Java is great!");

            // Check if `i` is equal to 2
            if (i == 2) {
                System.out.println("Ending the loop."); // Indicate the loop termination.
                break; // Exit the loop.
            }

            i++; // Increment `i`.
        }

        // Break statement in a Do-While loop:
        // ------------------------------------
        // The "break" statement can also terminate a do-while loop.
        // In this case, the loop runs at least once because it checks the condition after executing the loop body.
        int j = 0; // Initialize `j` to 0.

        do {
            System.out.println(j); // Print the value of `j`.
            System.out.println("Java is great!");

            // Check if `j` is equal to 2
            if (j == 2) {
                System.out.println("Ending the loop."); // Indicate the loop termination.
                break; // Exit the loop.
            }

            j++; // Increment `j`.
        } while (j < 5); // Loop condition checks if `j` is less than 5.

        // Continue Statement:
        // ---------------------
        // The "continue" statement skips the current iteration and moves to the next iteration of the loop.
        System.out.println("\nUsing Continue Statement:");

        for (int k = 0; k < 5; k++) {
            if (k == 2) {
                System.out.println("Skipping iteration for k = " + k); // Indicate skipping.
                continue; // Skip the rest of the loop body for this iteration.
            }
            System.out.println(k); // Print the value of `k` (only if it is not skipped).
        }
    }
}
