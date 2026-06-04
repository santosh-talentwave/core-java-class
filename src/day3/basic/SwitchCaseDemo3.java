package day3.basic;

import java.util.Scanner;

public class SwitchCaseDemo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice : ");
        String choice = sc.nextLine();
        switch (choice) {
            case "add":
                System.out.println("This is addition.");
                break;
            case "sub":
                System.out.println("This is subtraction.");
                break;
            case "mul":
                System.out.println("This is multiplication.");
                break;
            case "div":
                System.out.println("This is division.");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("remaining code!!!");
    }
}
