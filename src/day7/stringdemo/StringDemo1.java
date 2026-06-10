package day7.stringdemo;

public class StringDemo1  {

    public static void main(String[] args) {
       //Implicit creation
        String s1 = "Hello";
        System.out.println(s1);

        //Explicit creation
        String s2 = new String();
        System.out.println(s2);

        String s3 = new String("Hello");
        System.out.println(s3);

        char [] ch = {'h','e','l','l','o'};
        String s4 = new String(ch);
        System.out.println(s4);

        byte [] b = {97,98, 99};
        String s5 = new String(b);
        System.out.println(s5);

    }
}
