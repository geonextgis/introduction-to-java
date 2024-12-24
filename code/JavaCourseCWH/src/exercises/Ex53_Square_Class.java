/*
 * Create a class Square with a method to initialize its side, calculating area, perimeter etc.
 */

package code.JavaCourseCWH.src.exercises;

class Square {
    float side;

    public float area() {
        return side * side;
    }
    
    public float perimeter() {
        return 4 * side;
    }
}

public class Ex53_Square_Class {
    public static void main(String[] args) {

        // creating square object
        Square square1 = new Square();
        square1.side = 4.5f;

        System.out.println("The area of the square is: " + square1.area());
        System.out.println("The perimeter of the square: " + square1.perimeter());
    }
}
