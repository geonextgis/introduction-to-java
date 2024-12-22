/*
 * Write a function to convert Celsius temperature to Fahrenheit
 */

package code.JavaCourseCWH.src.exercises;
import java.util.Scanner;

public class Ex50_Celsius_to_Fahrenheit {

    static float cel_to_fah (float cel) {
        float fah = (cel * 1.8f) + 32;
        return fah;
    }
    
    public static void main (String[] args) {

        System.out.print("Enter a temperature in degree celsius: ");
        Scanner sc = new Scanner(System.in);
        float temp_cel = sc.nextFloat();
        sc.close();

        System.out.format("The %.2f degree C temperature in fahrenheit is: %.2f", temp_cel, cel_to_fah(temp_cel));
    }
}
