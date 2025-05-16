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
