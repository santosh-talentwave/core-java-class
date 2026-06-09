package day6.arraydemo;

import java.util.Scanner;

public class ArrayDemo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  [] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter element at index: " + i);
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }
        System.out.println("Sum of elements is: " + sum);
    }
}
