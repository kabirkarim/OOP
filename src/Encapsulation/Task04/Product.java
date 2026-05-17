package Encapsulation.Task04;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if(price>=0) this.price = price;
        else System.out.println("Invalid Input. Price Cannot be Negative.");
    }

    public void setQuantity(int quantity) {
        if(quantity>=0 )this.quantity = quantity;
        else System.out.println("Invalid Input. Quantity Cannot be Negative.");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValue(){
        return quantity*price;
    }
}
