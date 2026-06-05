package day4.oops;

public class MethodDemo2 {

    //<access modifier> void <method name> (one or more than one parameter of any type) {
    //your logic
    //}
    public void displayInfo(String name, int age, double salary, boolean status) {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Salary is: " + salary);
        System.out.println("Status is: " + status);
    }

    //<access modifier> <return type> <method name> (one or more than one parameter of any type) {
    //your logic
    //return suitable data/value matching with return type
    //}
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodDemo2 m = new MethodDemo2();

        String name = "John";
        int age = 20;
        double salary = 50000;
        boolean status = true;
        m.displayInfo(name, age, salary, status);
        m.displayInfo("Jack", 33, 5024.26, false);
        System.out.println("===============");
        int r = m.sum(1, 2);
        System.out.println("Sum of 1 and 2 is " + r);
    }
}
