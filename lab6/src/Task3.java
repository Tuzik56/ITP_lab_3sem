import java.util.*;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String command = scanner.nextLine();
            switch (command) {
                case "add":
                    add(map);
                    break;
                case "list":
                    list(map);
                    break;
                case "sum":
                    sum(map);
                    break;
                case "bestseller":
                    bestseller(map);
                    break;
                case "exit":
                    return;
            }
        }
    }

    public static void add(HashMap<String, Integer> map) {
        String product;
        int amount;

        try {
            System.out.println("product name:");
            product = scanner.nextLine();
            System.out.println("amount:");
            amount = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("incorrect value");
            return;
        }

        if (map.containsKey(product)) {
            map.put(product, map.get(product) + amount);
        } else {
            map.put(product, amount);
        }
    }

    public static void list(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        if (list.isEmpty()) {
            System.out.println("nothing to show");
        } else {
            for (Map.Entry<String, Integer> entry : list) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void sum(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        int sum = 0;

        if (list.isEmpty()) {
            System.out.println("nothing to show");
        } else {
            for (Map.Entry<String, Integer> entry : list) {
                sum += entry.getValue();
            }
            System.out.println(sum);
        }
    }

    public static void bestseller(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        if (list.isEmpty()) {
            System.out.println("nothing to show");
        } else {
            Collections.sort(list, new Sort());
            System.out.println(list.get(0).getKey() + ": " + list.get(0).getValue());
        }
    }
}
