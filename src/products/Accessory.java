package products;

public class Accessory extends Product {
    private String color;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        this.color = color;
    }

    // Getters و Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected String generateId() {
        return "3" + (int)(Math.random() * 10000);
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color;
    }
}



