import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<Product> products;

    public Storage(int amount) {
        this.products = new ArrayList<>();

        for (int i=0; i < amount; i++) {
            this.products.add(new Product());
        }
    }

    public synchronized boolean hasNextProduct() {
        return !products.isEmpty();
    }

    public synchronized Product getNextProduct() {
        Product product = products.get(0);
        products.remove(0);
        return product;
    }

    public synchronized void addProduct(Product product) {
        products.add(product);
    }

    public int getSize() {
        return products.size();
    }

    public int getSum() {
        int sum = 0;
        for (Product product: products) {
            sum += product.getWeight();
        }
        return sum;
    }
}
