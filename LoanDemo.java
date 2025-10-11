// Interface Loan
interface Loan {
    void approveLoan();
}

// Class HomeLoan implementing Loan
class HomeLoan implements Loan {
    @Override
    public void approveLoan() {
        System.out.println("Home loan approved with 8% interest rate.");
    }
}

// Class CarLoan implementing Loan
class CarLoan implements Loan {
    @Override
    public void approveLoan() {
        System.out.println("Car loan approved with 7% interest rate.");
    }
}

// Main class to demonstrate polymorphism
public class LoanDemo {
    public static void main(String[] args) {
        Loan loan1 = new HomeLoan();
        Loan loan2 = new CarLoan();

        // Calling method via interface reference (polymorphism)
        loan1.approveLoan();
        loan2.approveLoan();
    }
}