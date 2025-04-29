import products.Accessory;
import products.Notebook;
import products.Product;
import inventory.Inventory;

public class Main {
    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double total = 0;
        for (Product item : inventory.getItems()) {
            total += item.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {

        Inventory<Product> inventory = new Inventory<>();


        inventory.addItems(new Book("Java Programming", 50.0, "John Doe", "Tech Press", "Technical"));
        inventory.addItems(new Notebook("Daily Planner", 20.0, 200, true));
        inventory.addItems(new Accessory("Pen", 5.0, "Blue"));


        System.out.println("All Products:");
        inventory.displayAll();


        System.out.println("Total Price: " + calculateTotalPrice(inventory));


        Product found = inventory.findItemsById(Integer.parseInt(inventory.getItems().get(0).getId()));
        if (found != null) {
            System.out.println("Found Product: " + found);
        }


        inventory.findItemsById(9999);


        inventory.applyDiscount("Java Programming", 10);


        System.out.println("\nAfter Discount:");
        inventory.displayAll();


        inventory.removeItemsById(Integer.parseInt(inventory.getItems().get(1).getId()));


        System.out.println("\nAfter Removal:");
        inventory.displayAll();


        System.out.println("Final Total Price: " + calculateTotalPrice(inventory));
    }
}