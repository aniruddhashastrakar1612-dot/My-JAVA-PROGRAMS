class Account2 {
    int accno;
    String name;
    double balance;

    Account2(int accno, String name, double initialBalance) {
        this.accno = accno;
        this.name = name;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit Amount");
        } else {
            balance = balance + amount;
            System.out.println("Updated Balance:" + balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Remaining Balance:" + balance);
        }
    }
}

class Practical1_1 {
    public static void main(String[] args) {
        Account2 acc = new Account2(193, "Aniruddha", 50000);
        acc.deposit(1000);
        acc.withdraw(1000);
    }
} 

