
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance! Cannot withdraw " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // Initial balance

        try {
            account.withdraw(1200.0); // Trying to withdraw more than balance
        } catch (LowBalanceException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed. Final balance: " + account.getBalance());
        }

        try {
            String invalidInput = "abc";
            int number = Integer.parseInt(invalidInput); // Will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Built-in Exception Caught: Invalid number format.");
        }
    }
}