package code.JavaCourseCWH.src.codes;

public class P006_Operators_and_Expressions {
    public static void main (String[] args) {

        int a = 10;
        int b = 2;

        System.out.println("Two numbers are: " + a + " and " + b);


        // Arithmetic Operators
        System.out.println("'+' operation: " + (a + b));
        System.out.println("'-' operation: " + (a - b));
        System.out.println("'*' operation: " + (a * b));
        System.out.println("'/' operation: " + (a / b));
        System.out.println("'%' operation: " + (a % b));
        System.out.println("'a++' operation: " + (++a));
        System.out.println("'a--' operation: " + (--a));


        // Assignment Operators
        int c = 5;
        System.out.println("'+=' operation: " + (a += b));
        System.out.println("'-=' operation: " + (a -= b));


        // Comparison Operators
        System.out.println("'==' operation: " + (a == b));
        System.out.println("'>=' operation: " + (a >= b));
        System.out.println("'<=' operation: " + (a <= b));


        // Logical Operators
        System.out.println("'&&' (and) operation: " + (a>b && a>c));
        System.out.println("'||' (or) operation: " + (a>b || a>c));
        System.out.println("'!=' (not) operation: " + (a!=b));


        // Bitwise Operators
        System.out.println("'&' (Bitwise And) operation: " + (10 & 11));
        System.out.println("'|' (Bitwise Or) operation: " + (10 | 11));
    }
}


/*
 * Java Operators and Their Types
 * 
 * Operators in Java are symbols or keywords that perform operations on variables and values. 
 * These are classified into different types based on the functionality they provide.
 * 
 * 1. Arithmetic Operators:
 *    - Used for performing basic arithmetic operations.
 *      + : Addition
 *      - : Subtraction
 *      * : Multiplication
 *      / : Division
 *      % : Modulus (remainder)
 *      ++ : Increment (pre-increment used in this code)
 *      -- : Decrement (pre-decrement used in this code)
 *    - Example in code:
 *      - (a + b), (a - b), (a * b), (a / b), (a % b), (++a), (--a)
 * 
 * 2. Assignment Operators:
 *    - Used to assign values to variables, often in combination with arithmetic operations.
 *      =  : Assign
 *      += : Add and assign
 *      -= : Subtract and assign
 *      *= : Multiply and assign
 *      /= : Divide and assign
 *      %= : Modulus and assign
 *    - Example in code:
 *      - (a += b), (a -= b)
 * 
 * 3. Comparison (Relational) Operators:
 *    - Used to compare two values and return a boolean result (true/false).
 *      == : Equal to
 *      != : Not equal to
 *      >  : Greater than
 *      <  : Less than
 *      >= : Greater than or equal to
 *      <= : Less than or equal to
 *    - Example in code:
 *      - (a == b), (a >= b), (a <= b)
 * 
 * 4. Logical Operators:
 *    - Used to combine multiple conditions and return a boolean result.
 *      && : Logical AND (true if both conditions are true)
 *      || : Logical OR (true if at least one condition is true)
 *      !  : Logical NOT (negates the condition)
 *    - Example in code:
 *      - (a > b && a > c), (a > b || a > c), (a != b)
 * 
 * 5. Bitwise Operators:
 *    - Perform operations on binary representations of integers.
 *      &  : Bitwise AND (sets each bit to 1 if both bits are 1)
 *      |  : Bitwise OR (sets each bit to 1 if one of the bits is 1)
 *      ^  : Bitwise XOR (sets each bit to 1 if only one of the bits is 1)
 *      ~  : Bitwise Complement (inverts all bits)
 *      << : Left shift
 *      >> : Right shift
 *      >>>: Unsigned right shift
 *    - Example in code:
 *      - (10 & 11), (10 | 11)
 * 
 * 6. Other Operator Categories (not shown in this code):
 *    - Ternary Operator:
 *      - Syntax: (condition) ? value_if_true : value_if_false;
 *    - Unary Operators:
 *      - Example: +, -, ++, --, !
 *    - instanceof Operator:
 *      - Used to test if an object is an instance of a class.
 * 
 * Output of the Program:
 * - Demonstrates the usage of arithmetic, assignment, comparison, logical, and bitwise operators.
 * 
 * Notes:
 * - The increment (`++`) and decrement (`--`) operators can be used in two forms: pre and post. This code uses pre-increment and pre-decrement.
 * - Ensure understanding of operator precedence to avoid unexpected results in complex expressions.
 */
