package day8.stringdemo;

public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name ;
    }

    public static void main(String[] args) {
        String a = new String("hello");
        System.out.println(a);

        System.out.println("=================");

        User user = new User("John");
        System.out.println(user);
//        System.out.println(user.toString());
    }
}
