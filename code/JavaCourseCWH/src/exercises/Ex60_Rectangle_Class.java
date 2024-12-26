/*
 * Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters
 */

package code.JavaCourseCWH.src.exercises;

class MyRectangle {

    private float length;
    private float breadth;

    public MyRectangle() {
        length = 4f;
        breadth = 5f;
    }

    public MyRectangle(float l, float b) {
        length = l;
        breadth = b;
    }

    public float getLength() {
        return length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float b) {
        breadth = b;
    } 

    public void setLength(float l) {
        length = l;
    }
}

public class Ex60_Rectangle_Class {

    public static void main(String[] args) {

        // creating objects
        MyRectangle rect1 = new MyRectangle();
        System.out.println("The length of the rectangle: " + rect1.getLength());
        System.out.println("The breadth of the rectangle: " + rect1.getBreadth());

        MyRectangle rect2 = new MyRectangle(7, 8);
        System.out.println("The length of the rectangle: " + rect2.getLength());
        System.out.println("The breadth of the rectangle: " + rect2.getBreadth());
    }
}
