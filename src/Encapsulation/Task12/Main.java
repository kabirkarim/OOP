//Problem Statement
//        Create a product inventory system that stores items and sorts them by price in descending order,
//        displaying each product&#39;s total inventory value.
//        Class Name: Product
//        Private Fields:
//        ○ name (String)
//        ○ price (double) — must be >= 0
//        ○ quantity (int) — must be >= 0
//        Requirements
//        ● Take input for 5 products (name, price, quantity).
//        ● Implement getTotalValue() method that returns price x quantity.
//        ● Sort products by price in descending order using a comparison loop.
//        ● Display sorted products with name, price, and total value.

package Encapsulation.Task12;
import Encapsulation.Task04.Product;

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Product[] p = new Product[3];

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
                System.out.println();
            }
            Product temp;
            for(int i=0; i<(p.length-1);i++){
                for(int j=i+1; j<p.length;j++){
                    if(p[i].getPrice()<p[j].getPrice()){
                        temp=p[j];
                        p[j]=p[i];
                        p[i]=temp;
                    }
                }
            }

            System.out.println("---Products Sorted by Price---");
            for (Product k:p) {
                System.out.println("Product Name: " +k.getName()+
                        " | Price: "+k.getPrice()+
                        " | Total Value: "+k.totalValue());
            }

        }
}
