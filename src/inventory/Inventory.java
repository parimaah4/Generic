package inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    // Getters و Setters
    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void applyDiscount(String productName, int discount) {
        for (T item : items) {
            if (item.getTitle().equals(productName)) {
                double newPrice = item.getPrice() * (1 - discount / 100.0);
                item.setPrice(newPrice);
            }
        }
    }

    public void addItems(T product) {
        items.add(product);
    }

    public void removeItemsById(int id) {
        items.removeIf(item -> item.getId().equals(String.valueOf(id)));
    }

    public T findItemsById(int id) {
        for (T item : items) {
            if (item.getId().equals(String.valueOf(id))) {
                return item;
            }
        }
        System.out.println("Product with ID " + id + " not found.");
        return null;
    }

    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (T item : items) {
                System.out.println(item);
            }
        }
    }
}