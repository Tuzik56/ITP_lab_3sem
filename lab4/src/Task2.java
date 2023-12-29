import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file.txt");

        try {
            if (!file2.exists()) {
                throw new IOException("recording file not found");
            }
            Scanner scanner = new Scanner(file1);
            PrintWriter pw = new PrintWriter(file2);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                pw.println(line);
                pw.close();

            }
            scanner.close();
            pw.close();
        } catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
