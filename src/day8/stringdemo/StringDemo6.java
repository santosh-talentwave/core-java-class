package day8.stringdemo;

import java.util.StringTokenizer;

public class StringDemo6 {

    public static void main(String[] args) {
        String info = "Hello,, I am Santosh Lal Karna,,  I am FullStack Java Developer,,  I teach FullStack Java,, I enjoy learning new topics.";
        String[] ss = info.split(",");
        System.out.println(ss.length);
        for (String s : ss) {
            System.out.println(s);
        }

        System.out.println("===================");

        StringTokenizer st = new StringTokenizer(info, ",");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
