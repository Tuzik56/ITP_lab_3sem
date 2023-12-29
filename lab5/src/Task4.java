import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Task4 {
    public static void main(String[] args) {
        String ip = "0.255.128.56";
        try {
            checkIP(ip);
        } catch (IPAdressException | PatternSyntaxException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkIP(String ip) throws IPAdressException {
        String regex = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);
        if (!matcher.matches()) {
            throw new IPAdressException("Incorrect IP");
        }
    }
}
