package day2.basic;

public class TypeCastingDemo1 {

    public static void main(String[] args) {
        byte b1 = 127;
        int i1 = b1;//implicit type casting(conversion) by java compiler
        System.out.println(b1);
        System.out.println(i1);

        int i2 = 127;
        byte b2 = (byte) i2;//explicit type casting(conversion) by java programmer
        System.out.println(b2);
        System.out.println(i2);

        int i3 = 200;
        byte b3 = (byte) i3;
        System.out.println(b3);

        double d = 34.56;
        int i4 = (int) d;
        System.out.println(i4);
    }
}
