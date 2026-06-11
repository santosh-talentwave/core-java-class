package day8.stringdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        String info = "Hello, I am Santosh Lal Karna,  I am FullStack Java Developer,  I teach FullStack Java, I enjoy learning new topics.";
        StringTokenizer st = new StringTokenizer(info, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
