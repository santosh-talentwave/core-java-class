package day6.accessmodifierdemo;

public class AccessModifierDemo {

    public String publicVar = "this is a public variable";
    protected String protectedVar = "this is a protected variable";
    private String privateVar = "this is a private variable";
    String defaultVar = "this is a default variable";

    public void publicMethod() {
        System.out.println("this is a public method");
    }

    protected void protectedMethod() {
        System.out.println("this is a protected method");
    }

    private void privateMethod() {
        System.out.println("this is a private method");
    }

    void defaultMethod() {
        System.out.println("this is a default method");
    }

    public AccessModifierDemo(){
        System.out.println("This is public access constructor");
    }

    protected AccessModifierDemo(int a) {
        System.out.println("This is protected access constructor");
    }

    private AccessModifierDemo(int a, int b) {
        System.out.println("This is private access constructor");
    }

    AccessModifierDemo(String s){
        System.out.println("This is a default access constructor");
    }

    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo(10);
        demo.publicMethod();
        demo.protectedMethod();
        demo.privateMethod();
        demo.defaultMethod();
    }

}
