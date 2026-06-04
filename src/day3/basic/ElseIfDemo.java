package day3.basic;

public class ElseIfDemo {

    public static void main(String[] args) {
        int marks = 95;
        if(marks >= 80 && marks <= 100){
            System.out.println("Distinction");
        } else if(marks >= 70 && marks <= 79){
            System.out.println("First");
        }else if(marks >= 60 && marks <= 59){
            System.out.println("Second");
        }else if(marks >= 40 && marks <= 59){
            System.out.println("Third");
        } else{
            System.out.println("Failed");
        }
        System.out.println("remaining code!!!");
    }
}
