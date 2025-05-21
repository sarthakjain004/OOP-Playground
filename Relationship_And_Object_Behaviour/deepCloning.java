class Address implements Cloneable {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Override clone method for deep cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}

class Employee implements Cloneable {
    private String name;
    private int id;
    private Address address;  // Reference type member

    public Employee(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    // Override clone method to implement deep cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        // Deep clone the Address object
        cloned.address = (Address) address.clone();
        return cloned;
    }

    // Method to change address for testing
    public void changeAddress(String street, String city) {
        address = new Address(street, city);
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + ", id=" + id + ", address=" + address + "]";
    }
}

public class deepCloning {
    public static void main(String[] args) {
        try {
            // Create original object
            Address address = new Address("123 Main St", "New York");
            Employee emp1 = new Employee("John", 101, address);
            System.out.println("Original Employee: " + emp1);

            // Create deep clone
            Employee emp2 = (Employee) emp1.clone();
            System.out.println("Cloned Employee: " + emp2);

            // Modify original object's address
            emp1.changeAddress("456 Oak St", "Boston");
            
            // Show that changes to original don't affect clone
            System.out.println("\nAfter changing original's address:");
            System.out.println("Original Employee: " + emp1);
            System.out.println("Cloned Employee: " + emp2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}