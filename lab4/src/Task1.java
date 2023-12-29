import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        int sum = 0;
        try {
            for (int j=0; j<3; j++) {
                int n = scanner.nextInt();
                arr[j] = n;
            }
            for (int i=0; i < arr.length; i++) {
                sum += arr[i];
            }
            double average = (double) sum / arr.length;
            System.out.println(average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
        } catch (InputMismatchException e) {
            System.out.println("Error: not a number entered");
        }
    }
}