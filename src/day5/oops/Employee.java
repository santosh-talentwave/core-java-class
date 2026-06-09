package day5.oops;

//constructor overloading: we can create any number of constructor in a clas
//by differing number/type/order of parameter
public class Employee {
    private String name;
    private int salary;

    public Employee() {
        System.out.println("1. default constructor");
    }

    public Employee(String name) {
        this.name = name;
        System.out.println("2. 1-arg constructor");
    }

    public Employee(int salary) {
        this.salary = salary;
        System.out.println("3. 1-arg constructor");
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("4. 2-arg constructor");
    }

    public Employee( int salary, String name) {
        this.salary = salary;
        this.name = name;
        System.out.println("5. 2-arg constructor");
    }

    public void printEmployeeInfo (){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("James", 20000);
        emp1.printEmployeeInfo();

        Employee emp2 = new Employee("John");
        emp2.printEmployeeInfo();

        Employee emp3 = new Employee(3);
        emp3.printEmployeeInfo();

    }
}
