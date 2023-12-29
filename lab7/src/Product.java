import java.util.Random;

public class Product {
    private final int weight;

    public Product() {
        Random random = new Random();
        this.weight = random.nextInt(1, 30);
    }

    public int getWeight() {
        return weight;
    }
}
