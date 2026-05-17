//Problem Statement
//Extend the BankAccount class with a menu-driven interface that allows multiple transactions in a single
//        session.
//Class Name: BankAccount
//Private Fields:
//          ○ accountHolder (String)
//          ○ balance (double)
//Requirements
//      ● Show a menu with options: 1) Deposit 2) Withdraw 3) Check Balance 4) Exit
//      ● Use a while/do-while loop to allow repeated transactions.
//      ● Validate all deposits (must be positive) and withdrawals (must not exceed balance).
//      ● Exit cleanly when option 4 is selected.

package Encapsulation.Task08;
import java.util.Scanner;
public class Main {
    public static void main() {
        int choice;
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        do{
            System.out.println("----Menu----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an Option: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Amount: ");
                    b.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter Amount: ");
                    b.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Account Balance is "+ b.getBalance());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }

        }while (choice!=4);
    }

}
