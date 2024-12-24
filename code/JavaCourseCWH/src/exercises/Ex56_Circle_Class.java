/*
 * Create a class Circle with a method to initialize its radius, calculating area, perimeter etc.
 */

package code.JavaCourseCWH.src.exercises;

 class Circle {
     float radius;
 
     public float area() {
         return (22/7) * (radius * radius);
     }
     
     public float perimeter() {
         return 2 * (22/7) * radius;
     }
 }
 
 public class Ex56_Circle_Class {
     public static void main(String[] args) {
 
         // creating square object
         Circle circle1 = new Circle();
         circle1.radius = 5f;
 
         System.out.println("The area of the circle is: " + circle1.area());
         System.out.println("The perimeter of the circle is: " + circle1.perimeter());
     }
 }
 