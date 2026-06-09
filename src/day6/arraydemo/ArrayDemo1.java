package day6.arraydemo;

public class ArrayDemo1 {

    public static void main(String[] args) {
        int  [] numbers = new int[3];
        System.out.println(numbers);
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
