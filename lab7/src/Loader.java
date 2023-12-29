import java.util.ArrayList;
import java.util.List;

public class Loader {
    private final int limit;
    private int weight;
    private final Storage storage1;
    private final Storage storage2;
    private final List<Product> products;
    private final String name;

    public Loader(Storage storage1, Storage storage2, String name) {
        this.limit = 150;
        this.weight = 0;
        this.storage1 = storage1;
        this.storage2 = storage2;
        this.products = new ArrayList<>();
        this.name = name;
    }

    public void work() {
        while (storage1.hasNextProduct()) {
            load();
            System.out.println(name + " " + weight);
            unload();
        }
    }

    private void load() {
        boolean notFilled = true;
        while (storage1.hasNextProduct() && notFilled) {
            Product product = storage1.getNextProduct();
            if (product != null) {
                if (weight + product.getWeight() <= limit) {
                    products.add(product);
                    weight += product.getWeight();
                } else {
                    notFilled = false;
                    storage1.addProduct(product);
                }
            }
        }
    }

    private void unload() {
        for (Product product: products) {
            storage2.addProduct(product);
        }

        weight = 0;
        products.clear();
    }
}
