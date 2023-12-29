import java.util.Formatter;

public class Product {
    private String name;
    private int price;
    private int amount;

    public Product (String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String makeString() {
        return name + " " + Integer.toString(price) + " " + Integer.toString(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}