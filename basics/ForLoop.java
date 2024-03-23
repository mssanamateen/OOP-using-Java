import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("i value is " + i);
        }
        scanner.close(); // Closing the scanner to prevent resource leak
    }
}
