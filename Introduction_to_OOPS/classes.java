import java.util.*;

// Employee Class
class Employee {
    private int salary; // to store the salary of employee
    
    public String employeeName; // to store the name of employee
    
    // Method to set the employee name as given input
    public void setName(String s) {
        employeeName = s;
    }
    
    // Method to set the salary as given input
    public void setSalary(int val) {
        salary = val;
    }
    
    // Method to get the salary of the employee
    public int getSalary() {
        return salary;
    }
}

class classes{
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        
        // Setting different attributes of object 1 using available methods
        obj1.setName("Raj"); // Set name to "Raj"
        obj1.setSalary(10000); // Set salary to 10,000
        
        // Creating another object of Employee class
        Employee obj2 = new Employee();
        
        // Setting different attributes of object 2 in a similar way
        obj2.setName("Rahul"); // Set name to "Rahul"
        obj2.setSalary(15000); // Set salary to 15,000
        
        // Accessing the attributes of different objects
        System.out.println("Salary of " + obj1.employeeName + " is " + obj1.getSalary());
        System.out.println("Salary of " + obj2.employeeName + " is " + obj2.getSalary());
    }
}