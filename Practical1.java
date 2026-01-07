class Account {
    int acc_no;
    String name;
    double balance;

    Account(int acc_no, String name, double balance) {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
        System.out.println("Account No: " + acc_no + ", Name: " + name + ", Balance: " + balance);
    }
}

public class Practical1 {
    public static void main(String[] args) {
        new Account(193, "Aniruddha", 50000);
    }
}