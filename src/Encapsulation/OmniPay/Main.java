package Encapsulation.OmniPay;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- 🚀 OMNIPAY SYSTEM LIVE ---");

        // Part 3: Test Data Migrator
        var kabirAccount = new PaymentAccount("kabir karim, 5000.0");
        kabirAccount.activate();

        // Part 4: Test Overloaded Methods
        kabirAccount.processPayment(100.0);           // USD
        kabirAccount.processPayment(28000, "PKR");    // Converts 28000 to 100 USD
        kabirAccount.processPayment("PAY:50");        // Encoded

        // Part 5: Test Audit Summary
        System.out.println(kabirAccount.getAccountSummary());

        // Final Boss Logic Check
        var inactiveAccount = new PaymentAccount("Jane Doe", 10000.0);
        var winner = PaymentAccount.compareAccounts(kabirAccount, inactiveAccount);
        System.out.println("Active Priority Winner: " + winner.getAccountSummary());
    }
}
