package day2.basic;

public class OperatorsDemo6 {
    public static void main(String[] args) {
        //Ternary(conditional) Operator: ?:
        int a = 110;
        int b = 20;
//        if (a > b) {//true
//            System.out.println("a is greater than b.");
//        } else {//false
//            System.out.println("b is greater than a.");
//        }

        String result = (a > b) ? "a is greater than b" : "b is greater than a";
        System.out.println(result);

        boolean res = (a > b) ? true : false;
        System.out.println(res);
    }
}
