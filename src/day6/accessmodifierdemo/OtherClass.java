package day6.accessmodifierdemo;

public class OtherClass {

    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo("hi");
        demo.publicMethod();
        demo.protectedMethod();
//        demo.privateMethod();
        demo.defaultMethod();
    }
}
