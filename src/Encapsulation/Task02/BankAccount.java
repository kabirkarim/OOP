package Encapsulation.Task02;
public class BankAccount {
    private String accHolder;
    private double balance = 1000;

    public void deposit(double amount){
        if(amount>0)    this.balance+=amount;
        else System.out.println("Invalid Deposit Amount. Amount Must be greater than 0.");
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        }
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }
    public String getAccHolder() {
        return accHolder;
    }
    public double getBalance() {
        return balance;
    }
}
