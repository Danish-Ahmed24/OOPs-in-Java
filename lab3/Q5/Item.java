package Q5;
import java.util.ArrayList;
import java.util.Scanner;

public class Item {
    Scanner in = new Scanner(System.in);
    static ArrayList<Item> items = new ArrayList<>();

    public String itemName;
    public int itemID;
    private float price;
    private int stock;

    void addProducts() {
        Item i = new Item();
        System.out.println("Enter the item name:");
        i.itemName = in.nextLine();

        System.out.println("Enter the item ID: ");
        i.itemID = in.nextInt();

        System.out.println("Enter the price: ");
        i.setPrice(in.nextFloat());

        System.out.println("Enter the stock: ");
        i.setStock(in.nextInt());

        in.nextLine();

        items.add(i);
        System.out.println("Product added successfully :)");
    }

    void setPrice(float s) {
        this.price = s;
    }

    void setStock(int s) {
        this.stock = s;
    }

    public float getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    void searchById() {
        System.out.println("Enter Id of item: ");
        int sId = in.nextInt();
        in.nextLine();

        int index = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemID == sId) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Item foundItem = items.get(index);
            System.out.println("Item found: " + foundItem.itemName);
            System.out.println("Price: " + foundItem.getPrice());
            System.out.println("Stock: " + foundItem.getStock());

            System.out.println("Want to purchase? [y/n]: ");
            char purchase = in.next().charAt(0);
            if (purchase == 'Y' || purchase == 'y') {
                purchase(index);
            }
        } else {
            System.out.println("No match!");
        }
    }

    void searchByName() {
        System.out.println("Enter Name of item: ");
        String sName = in.nextLine();

        int index = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(sName)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Item foundItem = items.get(index);
            System.out.println("Item found: " + foundItem.itemName);
            System.out.println("Price: " + foundItem.getPrice());
            System.out.println("Stock: " + foundItem.getStock());

            System.out.println("Want to purchase? [y/n]: ");
            char purchase = in.next().charAt(0);
            in.nextLine();
            if (purchase == 'Y' || purchase == 'y') {
                purchase(index);
            }
        } else {
            System.out.println("No match!");
        }
    }

    void purchase(int index) {
        System.out.println("Enter the quantity of " + items.get(index).itemName + ": ");
        int qty = in.nextInt();
        in.nextLine();

        if (qty <= items.get(index).getStock()) {
            items.get(index).setStock(items.get(index).getStock() - qty);
            System.out.println("Purchased successfully!");
            showBill(items.get(index), qty);
        } else {
            System.out.println("The purchase cannot be completed due to insufficient stock.");
        }
    }
    void showBill(Item a, int quantity) {
        System.out.println("\n------ Purchase Bill ------");
        System.out.println("Item Name: " + a.itemName);
        System.out.println("Item ID: " + a.itemID);
        System.out.println("Price per unit: $" + a.getPrice());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + (a.getPrice() * quantity));
        System.out.println("----------------------------");
    }

}
