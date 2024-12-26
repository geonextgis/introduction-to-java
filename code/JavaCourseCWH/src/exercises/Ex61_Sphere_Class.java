/*
 * Create a class Circle and use getters and setters to set its radius 
 */

package code.JavaCourseCWH.src.exercises;

class MySphere {

    private float radius;

    public MySphere(float r) {
        radius = r;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float r) {
        radius = r;
    }
}

public class Ex61_Sphere_Class {

    public static void main(String[] args) {

        // creating objects
        MySphere circle = new MySphere(4.5f);
        System.out.println("The radius of the rectangle: " + circle.getRadius());
    }
}