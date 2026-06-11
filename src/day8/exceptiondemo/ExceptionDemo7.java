package day8.exceptiondemo;

public class ExceptionDemo7 {

    public static void main(String[] args) {
        vote(1);
        System.out.println("end of program.");
    }

    public static void vote(int age){
        if(age >= 18){
            System.out.println("You can vote!!!");
        } else {
           throw new InvalidAgeException("You can not vote!!!");
        }
    }
}
