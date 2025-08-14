package dev.lpa;

public abstract class ProductForSale {
    protected String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public double getSalesPrice(int quantity) {
        return quantity * price;
    }
    public abstract void showDetails();
}

