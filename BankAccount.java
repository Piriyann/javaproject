public class BankAccount {
    
    // Attributes - private vechu data hide panrom
    private String accountHolder;
    private double balance;
    
    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        // Rule 3: Balance negative la start aaga koodadhu
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance negative ah iruka mudiyadhu. 0 ah set panniyachu.");
        }
    }
    
    // Method 1: setAccountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    
    // Method 2: getAccountHolder
    public String getAccountHolder() {
        return accountHolder;
    }
    
    // Method 3: deposit - Rule 1: amount > 0 dhan
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit success: $" + amount);
        } else {
            System.out.println("Error: Deposit amount must be greater than 0");
        }
    }
    
    // Method 4: withdraw - Rule 2 & 3: amount <= balance, balance negative aaga koodadhu
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdraw amount must be greater than 0");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance. Current balance: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdraw success: $" + amount);
        }
    }
    
    // Method 5: getBalance
    public double getBalance() {
        return balance;
    }
}