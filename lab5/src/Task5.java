import java.util.Scanner;
import java.util.regex.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String text = scanner.nextLine();
            String letter = scanner.nextLine();

            if (isLetter(letter)) {
                String regex = "\\b[" + letter + letter.toUpperCase() + "][a-zA-Z]*\\b";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(text);

                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
            }
        } catch (PatternSyntaxException | LetterException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static boolean isLetter(String letter) throws LetterException {
        if (!(letter.length() == 1 && !letter.equals(letter.toUpperCase()))) {
            throw new LetterException("this is not a letter >:(");
        }
        return true;
    }
}
