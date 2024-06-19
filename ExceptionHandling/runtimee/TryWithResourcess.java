import java.util.Scanner;
class TryWithResourcess {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter nr: ");
            int nr = sc.nextInt();
            
            System.out.print("Enter dr: ");
            int dr = sc.nextInt();
            
            
            int result = nr/dr;
            System.out.println("Result of division: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
