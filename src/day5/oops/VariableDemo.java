package day5.oops;

public class VariableDemo {

    //non-static(instance) variable , data, member's data, properties, attributes, fields
    String instanceVar= "I am instance variable";

    //Static variable(class level variable)
    static String staticVar = "I am static variable";

    //the 'refVar1' is known as instance reference variable
    VariableDemo refVar1 = new VariableDemo();

    //the 'refVar2' is known as static reference variable
    VariableDemo refVar2 = new VariableDemo();

    //the 'name' parameter is also a local variable
    public void sayHello(String name) {
        String localVar = "I am local variable";

        //the 'refVar' is known as local reference variable
        VariableDemo refVar = new VariableDemo();
    }

    public static void main(String[] args) {
        String localVar = "I am local variable";

        //the 'refVar' is known as local reference variable
        VariableDemo refVar = new VariableDemo();
    }


}

//variables:
//1.local variable
//2.instance variable
//3.static  variable
//4.reference variable
