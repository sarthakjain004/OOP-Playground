// Class implementing Bank Account
class BankAccount {
    private String name; // to store the name of account holder
    private double balance; // to store the balance

    // Constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to make a deposit
    public void deposit(double amount) {
        balance += amount; // Update the balance
    }

    // Method to make a withdrawal
    public boolean withdrawal(double amount) {
        if (amount >= balance) {
            System.out.println("Insufficient amount");
            return false;
        }
        balance -= amount; // Update the balance
        return true;
    }
}

public class attributes {
    public static void main(String[] args) {
        // Creating an object of BankAccount class
        BankAccount account = new BankAccount("John Doe", 1000.0);

        // Accessing the attributes of the object
        System.out.println("Account Holder: " + account.getName());
        System.out.println("Initial Balance: " + account.getBalance());

        // Making a deposit
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Making a withdrawal
        if (account.withdrawal(200.0)) {
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Withdrawal failed.");
        }
    }
}