import java.util.Comparator;
import java.util.Map;

public class Sort implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String , Integer> n1, Map.Entry<String, Integer> n2) {
        return n2.getValue().compareTo(n1.getValue());
    }
}
