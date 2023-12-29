public class Test {
    public static void main (String[] args) {
        HashTable<String, Product> table = new HashTable<String, Product>();
        Product product = new Product("Milk", 100, 200);

        table.put("4607053473537", product);
        System.out.println(table.get("4607053473537").makeString());
        table.remove("4607053473537");
    }
}