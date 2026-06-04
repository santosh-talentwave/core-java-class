package day3.basic;

public class NestedIfElseDemo {
    public static void main(String[] args) {
        int a = 25;
        int b = 15;
        int c = 22;

        if(a > b){
            if(a > c){
                System.out.println("a is largest one.");
            } else {
                System.out.println("c is largest one.");
            }
        } else {
            if( b > c){
                System.out.println("b is largest one.");
            } else{
                System.out.println("c is largest one....");
            }
        }
        System.out.println("remaining code");
    }
}
