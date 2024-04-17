import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for which you want a table: ");
        int number = input.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(number + "*" + i + "=" + number * i);
            i += 1;
        }
        input.close();
    }
}
