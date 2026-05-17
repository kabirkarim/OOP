//Problem Statement
//Build a car showroom system that stores multiple car records and identifies the most expensive vehicle.
//Class Name: Car
//Private Fields:
//        ○ brand (String)
//        ○ price (double)
//        ○ year (int)
//Requirements
//        ● Take input for 3 cars (brand, price, year).
//        ● Validate: price must be >= 0 and year must be >= 1990.
//        ● Find and display the most expensive car with its brand, price, and year.

package Encapsulation.Task09;
import java.util.Scanner;
public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Car[] c = new Car[3];

        System.out.println("--Enter Car Details--");
        for (int i=0; i<c.length; i++){
            c[i]=new Car();
            System.out.println("Enter Car "+ (i+1)+" Detail");
            System.out.print("Brand: ");
            c[i].setBrand(sc.nextLine());
            System.out.print("Price: ");
            c[i].setPrice(sc.nextDouble());
            System.out.print("Year: ");
            c[i].setYear(sc.nextInt());
            sc.nextLine();
        }

        Car topCar=c[0];
        for(Car k:c){
            if(k.getPrice()> topCar.getPrice())
                topCar=k;
        }
        System.out.println("Top Expensive Car: \n" +
                "\nBrand: "+topCar.getBrand()+
                "\nPrice: "+topCar.getPrice()+
                "\nYear: "+topCar.getYear());

    }
}
