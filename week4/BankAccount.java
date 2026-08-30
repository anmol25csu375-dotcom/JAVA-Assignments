class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public Account(String accountNumber, String ownerName, double openingBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (openingBalance >= 0) {
            this.balance = openingBalance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Account{accountNumber='" + accountNumber + "', ownerName='" + ownerName + "', balance=" + balance + "}";
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account a1 = new Account("A001", "Alice");
        Account a2 = new Account("A002", "Bob", 100);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println("Deposit 50 to a1: " + a1.deposit(50));
        System.out.println(a1);

        System.out.println("Deposit 0 to a1: " + a1.deposit(0));
        System.out.println(a1);

        System.out.println("Deposit -10 to a1: " + a1.deposit(-10));
        System.out.println(a1);

        System.out.println("Withdraw 30 from a1: " + a1.withdraw(30));
        System.out.println(a1);

        System.out.println("Withdraw 1000 from a1: " + a1.withdraw(1000));
        System.out.println(a1);

        System.out.println("Withdraw 50 from a2: " + a2.withdraw(50));
        System.out.println(a2);
    }
}