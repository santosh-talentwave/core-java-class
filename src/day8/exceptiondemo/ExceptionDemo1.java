package day8.exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        try {
            System.out.println("inside try block start");
            int div = divide(a, b);
            System.out.println("The division is: " + div);
            System.out.println("inside try block end");
        } catch (ArithmeticException e) {
            System.out.println("inside catch block");
        }
        System.out.println("End of program.");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
