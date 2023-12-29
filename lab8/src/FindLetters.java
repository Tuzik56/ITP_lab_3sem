import java.util.List;

public class FindLetters {
    @DataProcessor
    public String findLetters(List<String> data) {
        StringBuilder output = new StringBuilder();
        List<String> temp = data.stream().filter(letter -> letter.length() == 1).toList();

        for (String t : temp) {
            output.append(t);
            output.append(" ");
        }
        return output.toString();
    }
}
