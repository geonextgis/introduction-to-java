/*
 * Create a class Cylinder and use getters and setters to set its radius and height
 * - Calculate surface area and volume of the cylinder
 */

package code.JavaCourseCWH.src.exercises;

class Cylinder {
    private float radius;
    private float height;

    public Cylinder(float r, float h) {
        radius = r;
        height = h;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float r) {
        radius = r;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float h) {
        height = h;
    }

    public float surfaceArea() {
        float surface_area = (2 * (22f/7f) * radius * height) + (2 * (22f/7f) * (radius * radius));
        return surface_area;
    }

    public float volume() {
        float volume = (22f/7f) * (radius * radius) * height;
        return volume;
    }
}

public class Ex59_Cylinder_Class {
    public static void main(String[] args) {

        // creating objects
        Cylinder cylinder1 = new Cylinder(4.5f, 6f);

        // cylinder1.setRadius(4.5f);
        // cylinder1.setHeight(6);

        System.out.println("The height of the cylinder: " + cylinder1.getHeight());
        System.out.println("The radius of the cylinder: " + cylinder1.getRadius());
        System.out.println("The surface area of the cylinder: " + cylinder1.surfaceArea());
        System.out.println("The volume of the cylinder: " + cylinder1.volume());
    }
}
