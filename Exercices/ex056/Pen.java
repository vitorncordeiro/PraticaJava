package dev.lpa;

public class Pen extends ProductForSale{
    public Pen(String type, double price, String description) {
        super(type, price, description);
    }
    public void showDetails() {
        System.out.println("This product is a " + this.type + ", the price is " + this.getPrice() + " and its description was: " + this.getDescription());
    }
}
