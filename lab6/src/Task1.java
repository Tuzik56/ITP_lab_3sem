import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("task1.txt");
        HashMap<String, Integer> map = new HashMap<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");

                for (String word: words) {
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Sort());

        int i = 0;
        while (i < list.size() && i < 10) {
            System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());
            i++;
        }
    }
}