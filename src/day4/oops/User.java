package day4.oops;

public class User {

    String name;
    int age;

//    public void assignInfo(String n, int a) {
//        name = n;
//        age = a;
//    }

    public User(String n, int a){
        name = n;
        age = a;
        System.out.println("constructor called!!!");
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
//        User u = new User();
//        u.assignInfo("John", 1);
//        u.printInfo();
//
//        u.assignInfo("Jack", 1);
//        u.printInfo();
        User user1 = new User("John Doe", 20);
        user1.printInfo();

        User user2 = new User("Jack Smith", 30);
        user2.printInfo();

    }
}
//constructor: is a special member function and has the following characteristics:
//1.its name is the same as class name
//2.we can use any access modifier
//3.we cannot use return type
//4.we cannot also use 'void' keyword
//it is mainly used to initialize member's data
//it runs only once for each object
