package day4.basic;

import java.util.Scanner;

public class WhileLoopDemo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Name is " + name);
            if (name.equals("santosh")) {
                flag = false;
            }
        }
        System.out.println("program terminated!!!");
    }
}
