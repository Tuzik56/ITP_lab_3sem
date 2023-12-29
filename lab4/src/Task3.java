import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        try {
            checkEmail(email);
        } catch (CustomEmailFormatException e) {
            System.out.println(e.getMessage());
            logException(e);
        }
    }

    private static void checkEmail(String email) throws CustomEmailFormatException {
        if (!email.contains("@")) {
            throw new CustomEmailFormatException("Email address '" + email + "' does not match format");
        }
    }

    private static void logException(Exception e) {
        File exceptions = new File("exceptions.txt");
        try {
            if (exceptions.exists()) {
                PrintWriter pw = new PrintWriter(exceptions);
                pw.println(e);
                pw.close();
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
