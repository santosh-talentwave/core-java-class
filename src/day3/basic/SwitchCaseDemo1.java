package day3.basic;

import java.util.Scanner;

public class SwitchCaseDemo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("This is addition.");
                break;
            case 2:
                System.out.println("This is subtraction.");
                break;
            case 3:
                System.out.println("This is Multiplication.");
                break;
            case 4:
                System.out.println("This is Division.");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("remaining code!!!");
    }
}
