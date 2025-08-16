package dev.lpa;

public class TV  extends  ProductForSale{
    public TV(String type, double price, String description){
        super(type, price, description);
    }
    public void showDetails(){
        System.out.println("This product is a(an) " + this.type + ", the  unit price is " + this.getPrice() + " and its description is: " + this.getDescription());
    }

}
