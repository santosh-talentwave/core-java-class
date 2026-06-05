package day4.oops;

public class MethodDemo1 {

    //<access modifier> void <method name> () {
    //your logic
    //}
    public void greet() {
        System.out.println("Hello, good evening!!!");
    }

    //<access modifier> <return type> <method name> () {
    //your logic
    //return suitable data/value matching with return type
    //}
    public int sum() {
        int a = 4;
        int b = 5;
        int add = a + b;
        return add;
    }

    public static void main(String[] args) {
        MethodDemo1 m = new MethodDemo1();
        m.greet();
        int result = m.sum();
        System.out.println(result);
    }
}
