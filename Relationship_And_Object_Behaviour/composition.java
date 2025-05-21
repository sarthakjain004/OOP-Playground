// Parent class representing a Computer
class Computer {
    // Components using composition
    private CPU cpu;
    private RAM ram;
    private Storage storage;

    // Constructor
    public Computer() {
        cpu = new CPU("Intel i7", 3.4);
        ram = new RAM(16);
        storage = new Storage(512, "SSD");
    }

    // Method to display computer specifications
    public void displaySpecs() {
        System.out.println("Computer Specifications:");
        System.out.println("----------------------");
        cpu.displayInfo();
        ram.displayInfo();
        storage.displayInfo();
    }
}

// Component class for CPU
class CPU {
    private String model;
    private double speed;

    public CPU(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("CPU: " + model + " (" + speed + " GHz)");
    }
}

// Component class for RAM
class RAM {
    private int size;

    public RAM(int size) {
        this.size = size;
    }

    public void displayInfo() {
        System.out.println("RAM: " + size + " GB");
    }
}

// Component class for Storage
class Storage {
    private int capacity;
    private String type;

    public Storage(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Storage: " + capacity + "GB " + type);
    }
}

// Main class to demonstrate composition
public class composition {
    public static void main(String[] args) {
        // Creating a computer object
        Computer myComputer = new Computer();
        
        // Displaying computer specifications
        myComputer.displaySpecs();
        System.out.println("\nDestroying computer object...");
        myComputer = null;
        System.gc(); // Suggest garbage collection
        System.out.println("Computer object is now null, and all its components will be garbage collected");
        /*
         * This demonstrates composition because:
         * 1. Computer HAS-A CPU
         * 2. Computer HAS-A RAM
         * 3. Computer HAS-A Storage
         * 4. If Computer is destroyed, all its components are also destroyed
         */
    }
}