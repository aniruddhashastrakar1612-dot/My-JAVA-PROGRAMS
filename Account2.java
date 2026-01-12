import java.util.Scanner;
class Account2 {
    int acc_no;
    String name;
    double amount;
    Account2(int acc_no, String name, double amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.amount = amount;
    }
    String deposit(double amt) {
        if (amt<=0){
            return "Invalid Deposit Amount";
        }else{
            amount+=amt;
            return "Deposit Successful";
        }
    }
    String withdraw(double amt) {
        if (amt<=0){
            return "Invalid Withdraw Amount";
        }else if(amt>amount){
            return "Insufficient Balance";
        }else{
            amount-=amt;
            return "Withdraw Successful";
        }
    }
    double getBalance() {
        return amount;
    }
}
class Account2Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account2 acc = new Account2(101, "Rahul", 5000);
        for (int i = 1; i <= 5; i++) {
            int choice = sc.nextInt();
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