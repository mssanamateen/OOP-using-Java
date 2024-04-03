import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for which you want a table: ");
        int number = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
        input.close();
    }
}
