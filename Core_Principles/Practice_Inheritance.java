class Employee{
    public String name;
    public int id;
    void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }
}

class Manager extends Employee{
    public int teamSize;
    Manager(String name, int id, int teamSize){
        super.name = name;
        super.id = id;
        this.teamSize = teamSize;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
    }
}

class Engineer extends Employee{
    public String specialization;
    Engineer(String name, int id, String specialization){
        super.name = name;
        super.id = id;
        this.specialization = specialization;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Specialization : " + specialization);
    }
}


//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your base class `Employee`, driver classes 'Manager', 'Engineer'.".

It creates a object of class `Manager`, uses the parametrised constructor to initialize the attributes of Manager and Employee class.
It then prints a line with text message "Manager Details".
Then it calls th displayDetails() method of class Manager which prints details of manager.

It creates a object of class `Engineer`, uses the parametrised constructor to initialize the attributes of Engineer and Employee class.
It then prints a line with text message "Engineer Details".
Then it calls th displayDetails() method of class Engineer which prints details of engineer.


public class Main {

    public static void main(String[] args) {
    
        String M_name, E_name, E_specialization;
        int M_id, E_id, M_teamSize;
    
        // Create Manager instance
        Manager manager = new Manager(M_name, M_id, M_teamSize);
        System.out.println("Manager Details");
        manager.displayDetails();

        // Create Engineer instance
        Engineer engineer = new Engineer(E_name, E_id, E_specialization);
        System.out.println("\nEngineer Details");
        engineer.displayDetails();
    }
}

*/

/*
//Below is the output statements

System.out.println("Name : " + name);
System.out.println("Id : " + id);
System.out.println("Team Size : " + teamSize);
System.out.println("Specialization : " + specialization);

*/ 
class Practice_Inheritance{
    public static void main(String[] args) {
        // Creating a Manager object
        Manager manager = new Manager("Alice", 101, 5);
        System.out.println("Manager Details");
        manager.displayDetails();

        // Creating an Engineer object
        Engineer engineer = new Engineer("Bob", 102, "Software Development");
        System.out.println("\nEngineer Details");
        engineer.displayDetails();
    }
}
