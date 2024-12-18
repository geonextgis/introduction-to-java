/*
 * Calculate the average marks from an array containing marks of all students in Physics using for-each loop
 */

package code.JavaCourseCWH.src.exercises;

public class Ex37_Array_Average_Marks {
    public static void main (String[] args) {
        
        float[] marks = {98.6f, 67.9f, 87.2f, 84.5f, 95.4f};
        float sum = 0.0f;

        for (float element : marks) {
            sum += element;
        }

        System.out.println("The average marks of the student is " + (sum/marks.length));
    }
}
