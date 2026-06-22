package practice_problems;

public class BankAccount {
    String accountNumber;
    String holder;
    double balance;

    static int totalAccounts = 0;

    BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void getStatement() {
        System.out.println(accountNumber + " " + holder + " " + balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("101", "Rahul", 5000);
        BankAccount a2 = new BankAccount("102", "Priya", 7000);
        BankAccount a3 = new BankAccount("103", "Aman", 10000);

        a1.deposit(1000);
        a1.withdraw(500);
        a1.deposit(200);
        a1.withdraw(300);
        a1.deposit(100);

        a2.deposit(500);
        a2.withdraw(1000);
        a2.deposit(300);
        a2.withdraw(200);
        a2.deposit(400);

        a3.deposit(1000);
        a3.withdraw(500);
        a3.deposit(2000);
        a3.withdraw(1000);
        a3.withdraw(1500);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("Total Accounts = " + totalAccounts);
    }
}
