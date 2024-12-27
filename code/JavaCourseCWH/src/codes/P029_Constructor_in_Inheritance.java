package code.JavaCourseCWH.src.codes;

class Base1 {
    int x;

    public Base1() {
        System.out.println("I am a constructor");
    }

    public Base1(int x) {
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }

    public int getX() {
        return x;
    }

    public void setX(int n) {
        x = n;
    }
}

class Derived1 extends Base1 {
    int y;

    public Derived1() {
        // super(0);
        System.out.println("I am a derived class constructor");
    }

    public Derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of Derived class with value of y as: " + y);
    }

    public int getY() {
        return y;
    }

    public void setY(int n) {
        y = n;
    }
}

class ChildofDerived extends Derived1 {
    public ChildofDerived() {
        System.out.println("I am a child of derived constructor");
    }

    public ChildofDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}

public class P029_Constructor_in_Inheritance {

    public static void main(String[] args) {

        // creating objects
        // Base1 b1 = new Base1();
        Derived1 d1 = new Derived1();

        System.out.println();

        Derived1 d2 = new Derived1(14, 9);

        System.out.println();

        ChildofDerived chd1 = new ChildofDerived();

        System.out.println();

        ChildofDerived chd2 = new ChildofDerived(14, 9, 10);
    }
}
