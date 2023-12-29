import java.util.List;

public class SortData {
    @DataProcessor
    public String sortData(List<String> data) {
        StringBuilder output = new StringBuilder();
        List<String> temp = data.stream().sorted().toList();

        for (String t : temp) {
            output.append(t);
            output.append(" ");
        }
        return output.toString();
    }
}
