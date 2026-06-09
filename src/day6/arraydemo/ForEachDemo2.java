package day6.arraydemo;

public class ForEachDemo2 {

    public static void main(String[] args) {
        int [] [] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int [] ar: arr){
            for (int num : ar){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
