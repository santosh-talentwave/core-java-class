package day8.stringdemo;

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        sb.append(" World ");
        System.out.println(sb);

        sb.insert(12, "Jack");
        System.out.println(sb);

        sb.delete(12, sb.length());
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
