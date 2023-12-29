import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Task3 {
    public static void main(String[] args) {
        String text = "Это ссылка: http://www.eto-ssylka.com а это тоже ссылка: https://www.eto-tozhe-ssylka.com";

        try {
            text = replaceLinks(text);
            System.out.println(text);
        } catch (PatternSyntaxException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String replaceLinks(String text) {
        Pattern pattern = Pattern.compile("(http|https)://[\\w-_./?=&:;,!@#$%^*()\\[\\]{}<>'\"+|~`]+");
        Matcher matcher = pattern.matcher(text);

        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            String link = matcher.group();
            matcher.appendReplacement(stringBuilder, "<a href='" + link + "'>" + link + "</a>");
        }
        matcher.appendTail(stringBuilder);

        return stringBuilder.toString();
    }
}

