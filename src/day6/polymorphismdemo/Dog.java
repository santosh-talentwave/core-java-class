package day6.polymorphismdemo;

public class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("Dog barks!!!");
    }
}
