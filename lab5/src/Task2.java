import java.util.regex.*;

public class Task2 {
    public static void main(String[] args) {
        String password = "password";
        try {
            checkPassword(password);
        } catch (IncorrectPasswordException | PatternSyntaxException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkPassword(String password) throws IncorrectPasswordException {
        String regex = "^(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,16}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            throw new IncorrectPasswordException("Incorrect password");
        }
    }
}
