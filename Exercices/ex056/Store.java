package dev.lpa;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        ArrayList<OrderItem> orders = new ArrayList<>();
        TV samsung = new TV("OLED TV", 2000, "Samsung 40\" TV 4k OLED Curved Screen SmarTV");
        Sofa madeiraMadeira = new Sofa("Double Sofa", 2999, "Madeira Madeira's High Quality Sofa, with comfortable upholstery");
        Pen bluePen = new Pen("Ballpoint Pen", 0.5, "BIC's Ballpoint blue pen");
        TV phillips = new TV("OLED TV", 2500, "Phillips 50\" TV 4k OLED Curved Screen SmarTV - Netflix included");

        orders.add(new OrderItem(1, samsung));
        orders.add(new OrderItem(2, madeiraMadeira));
        orders.add(new OrderItem(100, bluePen));
        orders.add(new OrderItem(2, phillips));

        for(OrderItem order : orders) {
            order.getProduct().showDetails();
            System.out.println( "The amount price is: " + order.getProduct().getSalesPrice(order.getQuantity()));
            order.getProduct().printPricedItem(order.getQuantity());
            System.out.println("---------------");
        }


    }
}
