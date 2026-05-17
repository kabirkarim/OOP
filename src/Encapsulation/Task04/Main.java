//Develop an inventory tracker for products using encapsulated fields.
//        Class Name: Product
//        Private Fields:
//        ○ name (String)
//        ○ price (double)
//        ○ quantity (int)
//        Requirements
//        ● Setters must prevent negative values for price and quantity.
//        ● Add a method getTotalValue() that returns the product of price and quantity.
//        ● In main, use a loop to allow the user to input details for 3 products.
//        ● Output the total inventory value of all products combined.
package Encapsulation.Task04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] p = new Product[3];
        double totalInventoryValue=0;
        System.out.println("--- Enter Details Of Products---");
        for(int i = 0; i<p.length; i++){
            p[i]=new Product();
            System.out.println("Product "+ (i+1));
            System.out.print("Name: ");
            p[i].setName(sc.nextLine());
            System.out.print("Price: ");
            p[i].setPrice(sc.nextDouble());
            System.out.print("Quantity: ");
            p[i].setQuantity(sc.nextInt());
            sc.nextLine();
            totalInventoryValue+=p[i].totalValue();
        }
        System.out.println("The Total Value of the Inventory is "+ totalInventoryValue);
    }
}
