package day6.polymorphismdemo;

//compile time polymorphism(static binding) which can be achieved by using overloading of method
public class Addition {

    public void sum(int a, int b) {
        int add = a + b;
        System.out.println("1. Sum is: " + add);
    }

    public void sum(int a, int b, int c) {
        int add = a + b + c;
        System.out.println("2. Sum is: " + add);
    }

    public void sum(double a, double b) {
        double add = a + b;
        System.out.println("3. Sum is: " + add);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.sum(1, 2, 3);
        obj.sum(1.4, 2.5);
    }
}
