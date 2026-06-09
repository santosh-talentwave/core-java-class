package day5.inheritance;

public class ParentChildTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.name);
        parent.greet();

        System.out.println("================");
        Child child = new Child();
        System.out.println(child.name);
        child.greet();


    }
}
