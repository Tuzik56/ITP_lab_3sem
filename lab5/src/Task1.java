import java.util.regex.*;

public class Task1 {
    public static void main(String[] args) {
        String text = "The price of the product is $19.99 12 2.4";
        try {
            Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage());
        }
    }
}
