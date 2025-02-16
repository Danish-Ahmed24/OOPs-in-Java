package Q3;

import java.util.ArrayList;

public class Product {
    static ArrayList<Product> cart = new ArrayList<Product>();
    private String name;
    private float price;
    private int quantity;
    Product(String name, float price, int quantity) {
        System.out.println("New Product Added: ");
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.display();
        cart.add(this);
    }
    Product() {
        System.out.println("Default Product Added: ");
        this.name = "Generic";
        this.price = 0.0f;
        this.quantity = 1;
        this.display();
        cart.add(this);
    }
    private void display() {
        System.out.println("Product: "+this.name+"\n Price: "+this.price+"\n Quantity: "+this.quantity);
    }
    void removeProduct() {
        System.out.println("Product Removed from cart: "+this.name);
        cart.remove(this);
    }
}
