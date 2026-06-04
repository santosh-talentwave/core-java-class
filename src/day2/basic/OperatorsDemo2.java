package day2.basic;

public class OperatorsDemo2 {
    public static void main(String[] args) {
        //Assignment operators: = += -= /= *= %=
        //Associativity: Right to left
        int x = 4 + 5 - 7 / 3 - 5 % 2 + 4 * 2;
        System.out.println(x);

        int a = 4;
        System.out.println(a);
        a += 5; //a = a + 5;
        System.out.println(a);
    }
}
