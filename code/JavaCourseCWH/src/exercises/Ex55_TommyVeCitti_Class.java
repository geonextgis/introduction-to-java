package code.JavaCourseCWH.src.exercises;

class TommyVeCitti {

    public void hit() {
        System.out.println("hitting...");
    }

    public void run() {
        System.out.println("running...");
    }

    public void fire() {
        System.out.println("firing...");
    }
}

public class Ex55_TommyVeCitti_Class {
    public static void main(String[] args) {

        // creating objects
        TommyVeCitti tommy = new TommyVeCitti();

        tommy.run();
        tommy.hit();
        tommy.fire();
    }
}
