package day4.oops;

public class Employee {
     String empName;
     int empId;

     public Employee(String eName, int eId) {
         empName = eName;
         empId = eId;
         System.out.println("Parameterized Constructor");
     }

     public Employee() {
         System.out.println("Default Constructor");
     }

     public void printEmployeeInfo() {
         System.out.println("Employee Name: " + empName);
         System.out.println("Employee ID: " + empId);
     }
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.printEmployeeInfo();

        Employee emp2 = new Employee("Eliza", 11);
        emp2.printEmployeeInfo();
    }
}
