package day6.interfacedemo;

public class InterfaceImplTest {

    public static void main(String[] args) {
        //InterfaceDmo1 obj = new InterfaceDmo1(); we can not create an object of an interface
        InterfaceDmo1 obj = new InterfaceDemoImpl();
        obj.m1();
    }
}
