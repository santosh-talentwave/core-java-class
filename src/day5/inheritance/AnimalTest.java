package day5.inheritance;

public class AnimalTest {

    public static void main(String[] args) {
        System.out.println("=============");
        Dog dog = new Dog();
        Animal animal = dog;//implicit object casting
        animal.speak();
       // animal.eat();

        Animal parent = new Animal();
        //Dog dogs = (Dog) parent;//explicit object casting
    }
}
