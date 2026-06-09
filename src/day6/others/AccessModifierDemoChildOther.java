package day6.others;

import day6.accessmodifierdemo.AccessModifierDemo;

public class AccessModifierDemoChildOther extends AccessModifierDemo {

    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo();
        demo.publicMethod();
//        demo.protectedMethod();
//        demo.privateMethod();
//        demo.defaultMethod();

        AccessModifierDemoChildOther child = new AccessModifierDemoChildOther();
        child.protectedMethod();
    }
}
