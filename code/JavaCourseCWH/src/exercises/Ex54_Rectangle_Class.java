/*
 * Create a class Rectangle with a method to initialize its length and width, calculating area, perimeter etc.
 */

package code.JavaCourseCWH.src.exercises;

class Rectangle {
    float length;
    float width;

    public float area() {
        return length * width;
    }

    public float perimeter() {
        return 2 * (length + width);
    }
}


public class Ex54_Rectangle_Class {

    public static void main(String[] args) {

        // creating objects
        Rectangle rect1 = new Rectangle();
        rect1.length = 4;
        rect1.width = 6;

        System.out.println("The area of a rectangle: " + rect1.area());
        System.out.println("The perimeter of a rectangle: " + rect1.perimeter());
    }
}
