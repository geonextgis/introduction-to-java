package code.JavaCourseCWH.src.codes;

public class P007_Operators_Precedence_and_Associativity {
    public static void main (String[] args) {

        // Precedence and Associativity in Java

        // Example 1: Demonstrating Precedence and Associativity
        int a = 6 * 5 - 34 / 2;
        /*
         * Explanation:
         * Operator precedence:
         * 1. Multiplication (*) and Division (/) have higher precedence than Subtraction (-).
         * 2. Operators with the same precedence are evaluated based on their associativity.
         * 
         * Associativity:
         * - Both * and / have Left-to-Right associativity.
         * 
         * Step-by-step evaluation:
         * = 6 * 5 - 34 / 2  // First evaluate * and /
         * = 30 - 34 / 2
         * = 30 - 17
         * = 13
         */
        System.out.println(a); // Output: 13

        // Example 2: Demonstrating Precedence and Associativity
        int b = 60 / 5 - 34 * 2;
        /*
         * Explanation:
         * Operator precedence:
         * 1. Division (/) and Multiplication (*) have higher precedence than Subtraction (-).
         * 
         * Associativity:
         * - Both / and * have Left-to-Right associativity.
         * 
         * Step-by-step evaluation:
         * = 60 / 5 - 34 * 2  // First evaluate / and *
         * = 12 - 34 * 2
         * = 12 - 68
         * = -56
         */
        System.out.println(b); // Output: -56

        // Quick Quiz - Example 1
        /*
         * int x = 6;
         * int y = 1;
         * int k = x * y / 2; // Using precedence and associativity
         * System.out.println("Quick Quiz-1: " + k);
         * 
         * Explanation:
         * = 6 * 1 / 2  // * and / are evaluated left-to-right
         * = 6 / 2
         * = 3
         */

        // Quick Quiz - Example 2
        /*
         * int a = 5;
         * int b = 1;
         * int c = 4;
         * int k = b * b - (4 * a * c) / (2 * a);
         * System.out.println("Quick Quiz-2: " + k);
         * 
         * Explanation:
         * 1. Parentheses have the highest precedence.
         * 2. Multiplication (*) and Division (/) follow.
         * 3. Subtraction (-) is evaluated last.
         * Step-by-step:
         * = b * b - ((4 * a * c) / (2 * a))
         * = 1 * 1 - (4 * 5 * 4) / (2 * 5)
         * = 1 - 80 / 10
         * = 1 - 8
         * = -7
         */
    }
}
