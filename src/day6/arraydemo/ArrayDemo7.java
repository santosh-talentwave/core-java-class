package day6.arraydemo;

public class ArrayDemo7 {
    public static void main(String[] args) {
        String [] [] fruits = {
                {"Apple", "Banana", "Orange"},
                {"Papaya", "Guava", "Kiwi"},
                {"Pomegranates", "Pineapple", "Dragon Fruit"}
        };
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < fruits.length; j++) {
                System.out.print(fruits[i][j]+" ");
            }
            System.out.println();
        }
    }
}
