package day5.oops;

public class User {

    String name;
    int age;

//    public User(String n, int a) {
//        name = n;
//        age = a;
//    }

//    public User(String name, int age) {
//        name = name;
//        age = age;
//    }

    //recommended(best practice)
//    public User(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public User(String name, int age) {
        name = this.name;
        age = this.age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        User u = new User("John Doe", 20);
        u.printInfo();
    }
}
