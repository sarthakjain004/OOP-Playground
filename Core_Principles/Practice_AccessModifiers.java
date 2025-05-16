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
