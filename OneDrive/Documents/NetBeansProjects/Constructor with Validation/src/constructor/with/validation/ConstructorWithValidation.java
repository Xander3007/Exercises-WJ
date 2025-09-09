package constructor.with.validation;

public class ConstructorWithValidation {

    static class Account {    
        private String accountNumber;
        private double balance;

        public Account(String accountNumber, double balance) {
            if (accountNumber == null || accountNumber.trim().isEmpty()) {
                System.out.println("Error: Account number cannot be null or empty.");
                this.accountNumber = "Invalid";
            } else {
                this.accountNumber = accountNumber;
            }

            if (balance < 0) {
                System.out.println("Error: Balance cannot be negative.");
                this.balance = 0; 
            } else {
                this.balance = balance;
            }
        }

        public void display() {
            System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Account acc1 = new Account("12345", 1000);
        acc1.display();

        Account acc2 = new Account("", 500);
        acc2.display();

        Account acc3 = new Account("67890", -200);
        acc3.display();
    }
}