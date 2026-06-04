package day2.basic;

public class OperatorsDemo3 {
    public static void main(String[] args) {
        //Increment/decrement operators
        //++    --
        //pre  post
        //++a  a++  --a  a--
        int a = 5;
        System.out.println(a);
         ++a;//a++; //a+=1;//a = a +1;
        System.out.println(a);

        System.out.println("===================");
        int x = 9;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
    }
}
