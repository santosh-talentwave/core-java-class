package day8.stringdemo;

public class StringDemo5 {

    public static void main(String[] args) {
        String info = "Hello, I am Santosh Lal Karna,  I am FullStack Java Developer,  I teach FullStack Java, I enjoy learning new topics.";
        String[] ss = info.split(",");
        for (String s : ss) {
            System.out.println(s);
        }
    }
}
