package day8.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] result = new int[1];

        try {
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            result[1] = divide(a, b);
            System.out.println("The division is: " + result[1]);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println(e);
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("End of program.");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
