//Problem Statement
//Create a BankAccount class to manage a user's balance safely through encapsulated methods.
//Class Name: BankAccount
//Private Fields:
//        ○ accountHolder (String)
//        ○ balance (double)
//Requirements
//      ● The deposit method should only accept positive amounts.
//      ● The withdrawal method must reject negative amounts and amounts greater than the current
//          balance.
//      ● Use Scanner to prompt the user for an initial deposit amount and a withdrawal amount.
//      ● Display the final balance after transactions.

package Encapsulation.Task02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BankAccount b = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        b.setAccHolder(sc.nextLine());
        System.out.print("Enter Deposit Amount: ");
        b.deposit(sc.nextDouble());
        System.out.print("Enter Withdrawal Amount: ");
        b.withdraw(sc.nextDouble());

        System.out.println("Final Balance "+ b.getBalance());
    }
}
