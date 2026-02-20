import java.util.Scanner;

// Type Content
class Account {
    int acc_no;
    String name;
    double amount;

    Account(int acc_no, String name, double amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.amount = amount;
    }

    String deposit(double amt) {
        if (amt <= 0) {
            return "Invalid Deposit Amount";
        } else {
            amount += amt;
            return "Deposit Successful";
        }
    }

    String withdraw(double amt) {
        if (amt <= 0) {
            return "Invalid Withdraw Amount";
        } else if (amt > amount) {
            return "Insufficient Balance";
        } else {
            amount -= amt;
            return "Withdraw Successful";
        }
    }

    double getBalance() {
        return amount;
    }
}

public class Practical1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create one account with opening Balance of 5000
        Account acc = new Account(101, "Rahul", 5000);

        // Program expects exactly 5 operations
        for (int i = 1; i <= 5; i++) {
            int choice = sc.nextInt();   // 1 for deposit, 2 for withdraw
            double amount = sc.nextDouble();
            String result = "";

            if (choice == 1) {
                result = acc.deposit(amount);
            } else if (choice == 2) {
                result = acc.withdraw(amount);
            } else {
                result = "Invalid Choice";
            }

            System.out.println(result + " | Balance: " + acc.getBalance());
        }

        sc.close();
    }
}