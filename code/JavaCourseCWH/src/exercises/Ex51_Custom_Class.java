/*
 * Create a class Employee with the following properties and methods:
 * - salary (property) (int)
 * - getSalary (method returning int)
 * - name (property) (string)
 * - getName (method returning string)
 * - setName (method changing name)
 */

package code.JavaCourseCWH.src.exercises;

class Employee {

    String name;
    int salary;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Ex51_Custom_Class {
    public static void main(String[] args) {

        Employee krish = new Employee();

        krish.setName("Krishnagopal Halder");
        krish.salary = 30000;

        krish.getName();
        System.out.println(krish.getName());
        System.out.println(krish.getSalary());
    }
}
