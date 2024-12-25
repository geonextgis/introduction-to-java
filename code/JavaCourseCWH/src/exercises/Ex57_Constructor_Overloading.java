/*
 * Overload the Employee constructor to initialize the salary to Rs 10,000
 */

package code.JavaCourseCWH.src.exercises;


class MyEmployee {

    private int id;
    private String name;
    private int salary;

    public MyEmployee(int s) {
        salary = s;
    }

    public int getID() {
        return id;
    }

    public void setID(int i) {
        id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int s) {
        salary = s;
    }

    public void print_details() {
        System.out.println("Employee name: " + this.getName());
        System.out.println("Employee id: " + this.getID());
        System.out.println("Employee salary: " + this.getSalary());
    }
}


public class Ex57_Constructor_Overloading {
    public static void main(String[] args) {

        MyEmployee emp1 = new MyEmployee(22000);
        emp1.setID(1);
        emp1.setName("Riju Dasgupta");

        emp1.print_details();
    }
}
