public class Account {
    private double balance;
        public Account(double ibalance) {
            if (ibalance > 0.0) {
                balance = ibalance;
            }
        }

        public void debit(double amount) {
            if (amount > balance) {
                System.out.println("Amount exceeds the Balance");
            } else {
                balance -= amount;
            }
        }

        public double getBalance() {
            return balance;
        }
    }

