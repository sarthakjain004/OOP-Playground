package Core_Principles;
//Your code goes here

class Employee{
    public String name;
    protected int employeeId;
    private double salary;

    public void setSalary(double salary){
        if(salary<0)
        {
             System.out.println("Invalid salary");
            salary = 0;
        }
        this.salary = salary;
    }
    public double getSalary()
    {
        return this.salary;
    }
    Employee(String name, int employeeId, double salary1)
    {
        this.name = name;
        this.employeeId = employeeId;
        if(salary1<0)
        {
            System.out.println("Invalid salary");
            salary = 0;
            return;
        }
        else this.salary = salary1;
    }
    public void displayEmployeeDetails(){
        System.out.println("Name : " + name);
        System.out.println("Employee Id : " + employeeId);
        System.out.printf("Salary : %.2f\n" , salary);
    }
}


//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your `Employee` class.

It creates a object of class `Employee`, the parameterised constructor sets the values of nam, employeeId, salary attributes.
It calls the getSalary method to display the salary set by parameterised constructor.
It then calls the setSalary mehod to set the newSalary.
Then simple displayEmployeeDetails is called to prin the details of employee in specified format.


// Main class to demonstrate the functionality of the Student class
public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
            
        String name;
        int employeeId;
        double salary;
        double newSalary;

        // Create an Employee object
        Employee employee = new Employee(name, employeeId, salary);

        // Get and print the salary
        System.out.printf("Salary : %.2f\n", employee.getSalary());

        // Update the salary
        employee.setSalary(newSalary);

        // Display employee details
        employee.displayEmployeeDetails();

        sc.close();
    }
}

*/

/*
//Below is the output format

System.out.println("Name : " + name);
System.out.println("Employee Id : " + employeeId);
System.out.printf("Salary : %.2f\n" , salary);

*/
public class Practice_AccessModifiers {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 12345, 50000);
        employee.displayEmployeeDetails();
        
        // Accessing public attribute
        System.out.println("Public Name: " + employee.name);
        
        // Accessing protected attribute
        System.out.println("Protected Employee ID: " + employee.employeeId);
        
        // Accessing private attribute through getter
        System.out.println("Private Salary: " + employee.getSalary());
    }
}
