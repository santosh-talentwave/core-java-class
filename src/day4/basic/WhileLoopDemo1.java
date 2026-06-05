package day4.basic;

public class WhileLoopDemo1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i <= 5){
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
