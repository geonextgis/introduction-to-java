/*
 * Create a class Animak and derive another class Dog from it.
 */

package code.JavaCourseCWH.src.exercises;

class Animal {
    private String color;
    private float weight;

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setWeight(float w) {
        weight = w;
    }
}


class Dog extends Animal {

    String breed;

    public Dog(String b) {
        breed = b;
    }

    public void barking() {
        System.out.println("barking...");
    }
}

public class Ex62_Animal_Class {
    public static void main(String[] args) {

        // creating objects of Dog class
        Dog dog = new Dog("Labrador");
        dog.setColor("Brown");
        dog.setWeight(40);

        System.out.println("The breed of the dog: " + dog.breed);
        System.out.println("The color of the dog: " + dog.getColor());
        System.out.println("The weight of the dog: " + dog.getWeight());
    }
}
