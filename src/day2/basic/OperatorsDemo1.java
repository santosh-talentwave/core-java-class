package day2.basic;

public class OperatorsDemo1 {

    public static void main(String[] args) {
        //1.Arithmetic Operators: +(plus) -(minus) *(multiply) /(divide) %(modulus)
        //priority: + -(low) * / %(high)
        //Associativity: left to right

        int x = 4 + 5 - 7 / 3 - 5 % 2 + 4 * 2;
        x = 4 + 5 - 2 - 5 % 2 + 4 * 2;
        x = 4 + 5 - 2 - 1 + 4 * 2;
        x = 4 + 5 - 2 - 1 + 8;
        x = 9 - 2 - 1 + 8;
        x = 7 - 1 + 8;
        x = 6 + 8;
        x = 14;
        System.out.println(x);

    }
}
