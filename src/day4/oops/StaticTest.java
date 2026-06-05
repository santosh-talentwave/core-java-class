package day4.oops;

public class StaticTest {
    public static void main(String[] args) {
        int sum = StaticDemo.a + StaticDemo.b;
        System.out.println("sum = " + sum);

        //method calling
        StaticDemo.greet();
    }
}
