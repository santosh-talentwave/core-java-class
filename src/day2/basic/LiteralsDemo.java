package day2.basic;

public class LiteralsDemo {
    public static void main(String[] args) {
        //Literals: the source code representation of fixed value
        //Literals: value + data type

        //1.Integer literals 456 7687 8989 798776867 567545546(int)
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l1 = 2147483647;
        long l2 = 2147483648L;

        //2.floating literals: 34.56 45.678(double)
        float f = 34.56F;
        double d = 34.56;

        //3.character literals
        char c1 = 'a';
        char c2 = '1';
        char c3 = '#';
        char c4 = '\u0000';

        //4.Boolean Literals
        boolean b1 = true;
        boolean b2 = false;

        //5.String literal
        String s1 = "Hello";
        String s2 = "abc@123#";
        String s3 = "a";
        String s4 = "1234";
        String s5 = "23.45";
        String s6 = "true";
        String s7 = "";
        String s8 = " ";
        String s9 = "I am Santosh Lal Kara. I am Full Stack Java Developer with 13 yrs of experiences. I also teach full stack java.";

        //6.Null literals
        String s10 = null;

        //this(new LiteralsDemo()) is known as object
        LiteralsDemo obj = new LiteralsDemo();
        LiteralsDemo ob = null;
    }
}
//ASCII characters 0-255
//UNICODE characters 0-65535