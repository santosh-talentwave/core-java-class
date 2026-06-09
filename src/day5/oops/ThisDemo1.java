package day5.oops;

public class ThisDemo1 {

    //instance variable
    int a = 5;

    //non-static method
    public void printSum() {
        System.out.println("this is: " + this);
        System.out.println(a);
        //local variables
        int a = 4;
        System.out.println(a);

//        int sum = a + a;
//        ThisDemo1 obj = new ThisDemo1();
//        int sum = obj.a + a;
        int sum = this.a + a;
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        ThisDemo1 obj1 = new ThisDemo1();
        System.out.println("obj1 = " + obj1);
        obj1.printSum();

        System.out.println("====================");
        ThisDemo1 obj2 = new ThisDemo1();
        System.out.println("obj2 = " + obj2);
        obj2.printSum();

        //in static method 'this' is not available
       // System.out.println(this.a);
    }
}

