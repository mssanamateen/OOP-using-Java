import java.util.Scanner;

public class ConditionalScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your Name? ");
        String name = input.next();
        System.out.printf("HI %s ", name);
        System.out.println("Please Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.println("Please Enter Number 2: ");
        int num2 = input.nextInt();
        System.out.println("Please Enter Number 3: ");
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.printf("%d is Greatest", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("%d is Greatest", num2);
        } else {
            System.out.printf("%d is Greatest", num3);
        }
        input.close();
    }
}
