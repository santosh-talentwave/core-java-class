package day4.oops;

public class NonStaticDemo {

    //non-static(instance) variable, attributes, properties, data, member's data, fields
    int a = 5;
    int b = 6;

    //non-static method declaration
    public void greet() {
        System.out.println("Hello, good evening!!!");
    }

    public static void main(String[] args) {
        NonStaticDemo obj = new NonStaticDemo();
        int sum = obj.a + obj.b;
        System.out.println("sum = " + sum);

        //method calling
        obj.greet();
    }
}
