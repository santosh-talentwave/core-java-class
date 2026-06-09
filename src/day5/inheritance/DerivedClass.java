package day5.inheritance;

public class DerivedClass extends BaseClass {

    //hiding variable
    String name = "Child's name";

    public DerivedClass() {
        super(4);
        System.out.println("child default constructor");
    }

    public DerivedClass(int n) {
//        super();
        System.out.println("child's parameterized constructor");
    }

    //overriding method
    public void greet() {
        System.out.println("Hello from child.");
        System.out.println(name);
        System.out.println(super.name);
        super.greet();
    }
}
