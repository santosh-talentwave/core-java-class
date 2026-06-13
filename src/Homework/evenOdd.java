package Homework;

import java.util.Scanner;
public class evenOdd {

    public static void main (String[] args) {

        int number, remainder;
        System.out.println("please enter an integer number");
        Scanner scan= new Scanner(System.in);
        number = scan.nextInt();
        scan.close();
        remainder = number % 2;
        if (remainder == 0)
            System.out.println(number+" is even Number");
         else
            System.out.println(number +" is odd Number ");


    }
}
