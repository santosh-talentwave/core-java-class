package day5.oops;

public class DefaultValueDemo {

    //instance variable
    String name;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bool;
    char c;
    DefaultValueDemo obj;

    public void printValues() {
        System.out.println("Name: " + name);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Bool: " + bool);
        System.out.println("Char: " + c);
        System.out.println("Object: " + obj);
    }

    public static void main(String[] args) {
        DefaultValueDemo demo = new DefaultValueDemo();
        demo.printValues();

        System.out.println("=======local variable=========");
        //local variable has no default values
        String name = null;
        byte b = 0;
        short s;
        int i;
        long l;
        float f;
        double d;
        boolean bool;
        char c;
        DefaultValueDemo obj;
        System.out.println("Name: " + name);
        System.out.println("Byte: " + b);
//        System.out.println("Short: " + s);
//        System.out.println("Int: " + i);
//        System.out.println("Long: " + l);
//        System.out.println("Float: " + f);
//        System.out.println("Double: " + d);
//        System.out.println("Bool: " + bool);
//        System.out.println("Char: " + c);
//        System.out.println("Object: " + obj);
    }
}
