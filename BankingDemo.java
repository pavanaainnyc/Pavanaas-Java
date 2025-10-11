// Abstract class
abstract class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Abstract method to be implemented by subclasses
    public abstract void accountType();

    // Concrete method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        accountType(); // Call to overridden method
    }
}

// SavingsAccount class
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void accountType() {
        System.out.println("Account Type: Savings Account");
    }

    public void addInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

// CurrentAccount class
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void accountType() {
        System.out.println("Account Type: Current Account");
    }

    public void overdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Overdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class BankingDemo {
    public static void main(String[] args) {
    
        Account acc1 = new SavingsAccount("Alice", 5000, 5);
        Account acc2 = new CurrentAccount("Bob", 3000, 1000);
     
        acc1.displayDetails();
        ((SavingsAccount) acc1).addInterest();

        System.out.println();

        acc2.displayDetails();
        ((CurrentAccount) acc2).overdraw(500);
    }
}