package day4.oops;

public class StaticDemo {

    //static variable
    static int a = 5;
    static int b = 6;

    //static method declaration
    public static  void greet() {
        System.out.println("Hello, good evening!!!");
    }

    public static void main(String[] args) {
        int sum = StaticDemo.a + StaticDemo.b;
        System.out.println("sum = " + sum);

        //method calling
        StaticDemo.greet();
    }
}
