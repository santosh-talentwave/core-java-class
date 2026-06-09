package day5.inheritance;

public class BaseDerivedTest {

    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();
//        System.out.println(dc.name);
        dc.greet();

        System.out.println("===============");

        DerivedClass dc2 = new DerivedClass(5);

        System.out.println("============");

    }
}
