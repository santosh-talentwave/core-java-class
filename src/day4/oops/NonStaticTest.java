package day4.oops;

public class NonStaticTest {
    public static void main(String[] args) {
        NonStaticDemo demo = new NonStaticDemo();
        int sub = demo.a - demo.b;
        System.out.println("sub = " + sub);

        demo.greet();
    }
}
