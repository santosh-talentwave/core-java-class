package day7.stringdemo;

public class StringDemo2 {

    public static void main(String[] args) {

        String s1 = "Good Morning";
        System.out.println(s1);
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0, 4));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.length());
        System.out.println(s1.indexOf("M"));
        System.out.println(s1.lastIndexOf("o"));
        System.out.println(s1.charAt(7));
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());
        System.out.println(s1.contains("Morning"));
        System.out.println("Hello, ".concat(s1));
        System.out.println(s1.replace("Morning", "Evening"));
        System.out.println(s1.startsWith("G"));
        System.out.println(s1.endsWith("e"));

        String s2 = " Santosh Lal Karna ";
        System.out.println(s2);
        System.out.println(s2.trim());

    }
}
