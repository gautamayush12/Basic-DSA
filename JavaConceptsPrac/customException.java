package JavaConceptsPrac;

public class customException {

    // ---------- Custom Exception ----------
    public static class InsufficientBalanceException extends RuntimeException {

        public InsufficientBalanceException(double balance, double amount) {
            super("Withdrawal failed! Balance: ₹" + balance +
                  ", Requested: ₹" + amount);
        }
    }

    // ---------- Domain Class ----------
    public static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount) {

            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }

            balance -= amount;
            System.out.println(
                "Withdrawal successful. Remaining balance: ₹" + balance
            );
        }
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(2000);
            account.withdraw(6000);
        } catch (InsufficientBalanceException ex) {
            System.out.println("Custom Exception Caught:");
            System.out.println(ex.getMessage());
        }
    }
}
