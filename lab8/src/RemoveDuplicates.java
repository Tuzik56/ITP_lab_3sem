import java.util.List;

public class RemoveDuplicates {
    @DataProcessor
    public String removeDuplicates(List<String> data) {
        StringBuilder output = new StringBuilder();
        List<String> temp = data.stream().distinct().toList();

        for (String t : temp) {
            output.append(t);
            output.append(" ");
        }
        return output.toString();
    }
}
