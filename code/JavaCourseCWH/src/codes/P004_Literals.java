package code.JavaCourseCWH.src.codes;

public class P004_Literals {
    public static void main (String[] args) {
        byte age = 34;
        int age2 = 56;
        short age3 = 87;
        long ageDino = 5666666666l;
        char ch = 'A';
        float f1 = 5.6f;
        double d1 = 4.66d;
        boolean a = true;
        String str = "Krish";

        System.out.println(age);
        System.out.println(age2);
        System.out.println(age3);
        System.out.println(ageDino);
        System.out.println(ch);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(a);
        System.out.println(str);
    }
}

/*
 * This Java program demonstrates the use of literals, which are fixed values directly assigned to variables.
 * Below are the types of literals used in the program:
 * 
 * 1. Integer Literals:
 *    - byte age = 34; (34 is a literal of type byte)
 *    - int age2 = 56; (56 is an integer literal of type int, the default type for integers)
 *    - short age3 = 87; (87 is a literal of type short)
 *    - long ageDino = 5666666666l; (The 'l' suffix indicates this is a long literal. Always use 'L' for better readability)
 * 
 * 2. Character Literal:
 *    - char ch = 'A'; ('A' is a single character literal enclosed in single quotes)
 * 
 * 3. Floating-Point Literals:
 *    - float f1 = 5.6f; (The 'f' suffix indicates this is a float literal; without it, 5.6 is treated as double by default)
 *    - double d1 = 4.66d; (The 'd' suffix is optional as double is the default type for floating-point numbers)
 * 
 * 4. Boolean Literal:
 *    - boolean a = true; (true is a boolean literal; the only valid values for boolean are true and false)
 * 
 * 5. String Literal:
 *    - String str = "Krish"; ("Krish" is a string literal enclosed in double quotes)
 * 
 * This program also uses the `System.out.println()` method to print the values of all these literals to the console.
 */
