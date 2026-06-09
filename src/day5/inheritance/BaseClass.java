package day5.inheritance;

public class BaseClass {

    //hidden variable
    String name = "parent's name";

    public BaseClass() {
        System.out.println("parent's default constructor");
    }

    public BaseClass(int n) {
        System.out.println("parent's parameterized constructor");
    }

    //overridden method
    public void greet() {
        System.out.println("Hello from parent.");
    }
}
