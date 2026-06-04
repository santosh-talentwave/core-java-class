package day3.basic;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: : ");
        char ch = sc.next().charAt(0);

        int a = 0, b = 0;
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            System.out.println("Enter a: ");
            a = sc.nextInt();
            System.out.println("Enter b: ");
            b = sc.nextInt();
        }
        switch (ch) {
            case '+':
                int sum = a + b;
                System.out.println("The sum is: " + sum);
                break;
            case '-':
                int diff = a - b;
                System.out.println("The diff is: " + diff);
                break;
            case '*':
                int multi = a * b;
                System.out.println("The multi is: " + multi);
                break;
            case '/':
                int div = a / b;
                System.out.println("The div is: " + div);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("remaining code!!!");
    }
}
