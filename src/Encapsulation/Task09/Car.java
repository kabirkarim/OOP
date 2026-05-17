package Encapsulation.Task09;

public class Car {
    private String brand;
    private double price;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        if(price>=0) this.price = price;
    }

    public void setYear(int year) {
        if(year>=1990)   this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }
}
