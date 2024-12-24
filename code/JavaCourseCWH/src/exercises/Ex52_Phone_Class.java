/*
 * Create a class cellphone with methods to print "ringing...", "vibrating..." etc.
 */

package code.JavaCourseCWH.src.exercises;

class CellPhone {
    public void ring() {
        System.out.println("ringing...");
    }

    public void vibrate() {
        System.out.println("vibrating...");
    }
}

public class Ex52_Phone_Class {
    public static void main(String[] args) {

        // creating cell phone objects
        CellPhone phone1 = new CellPhone();
        phone1.ring();
        phone1.vibrate();
    }
}
