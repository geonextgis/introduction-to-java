package code.JavaCourseCWH.src.codes;

public class P008_Resulting_Datatype {
    public static void main (String[] args) {
        // Resulting Datatype in Expressions
        /*
         * When performing arithmetic operations between different data types in Java:
         * 1. If operands are of different data types, the result is automatically promoted 
         *    to the data type of the larger operand.
         * 2. Example:
         *    - byte, short, and int are promoted to int in expressions.
         *    - If one operand is float, the result is promoted to float.
         *    - If one operand is double, the result is promoted to double.
         */

        byte x = 5;        // `byte` type
        // int y = 6;         // `int` type
        // short z = 8;       // `short` type
        // int a = y + z;     // Result is `int` because `short` is promoted to `int`
        float b = 6.54f + x; // Result is `float` because `byte` is promoted to `float`
        System.out.println(b); // Output: 11.54

        // Increment and Decrement Operators
        /*
         * Increment and decrement operators are used to increase or decrease a variable's value by 1.
         * They can be used in two forms:
         * 1. Post-increment/post-decrement (e.g., i++, i--):
         *    - The operation is performed after the current value is used.
         * 2. Pre-increment/pre-decrement (e.g., ++i, --i):
         *    - The operation is performed before the current value is used.
         */

        int i = 56;
        System.out.println(i++); // Post-increment: Prints the current value (56), then increments i to 57.
        System.out.println(i);   // Prints the incremented value (57).
        System.out.println(++i); // Pre-increment: Increments i to 58, then prints it.
        System.out.println(i);   // Prints the current value (58).

        // Quick Quiz-1: Increment and Decrement Operators
        /*
         * Try increment and decrement operators on a Java variable:
         * int a = 50;
         * System.out.println(a++); // Post-increment: Prints 50, then increments to 51.
         * System.out.println(a);   // Prints 51.
         * System.out.println(++a); // Pre-increment: Increments to 52, then prints 52.
         * System.out.println(a);   // Prints 52.
         * System.out.println(a--); // Post-decrement: Prints 52, then decrements to 51.
         * System.out.println(a);   // Prints 51.
         * System.out.println(--a); // Pre-decrement: Decrements to 50, then prints 50.
         * System.out.println(a);   // Prints 50.
         */

        // Quick Quiz-2: Evaluate an Expression with Pre-increment
        /*
         * Example:
         * int y = 7;
         * int x = ++y * 8;
         * System.out.println(x);
         * 
         * Explanation:
         * - `++y` increments y to 8.
         * - The expression `++y * 8` becomes `8 * 8`.
         * - Result: x = 64
         */

        // Quick Quiz-3: Incrementing a Character
        /*
         * Example:
         * char a = 'B';
         * System.out.println(a++); // Prints 'B', then increments to 'C'.
         * System.out.println(a);   // Prints 'C'.
         * 
         * Explanation:
         * - Characters in Java are internally represented as integer ASCII/Unicode values.
         * - Incrementing a character increments its ASCII value.
         */
    }
}
