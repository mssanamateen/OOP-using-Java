import java.util.*;

class Tribonacci {
    int n; // Declaring an integer

    Tribonacci() {
        n = 0; // Initializing n
    }
    ṇ

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms to be printed");
        n = sc.nextInt(); // Accepting the number from user
    }

    void tribo() {
        int a = 0, b = 1, c = 2, d;
        for (int i = 1; i <= n; i++) {
            // Print the current term
            System.out.print(a);

            // Calculate the next term in the Tribonacci series
            d = a + b + c;
            a = b;
            b = c;
            c = d;

            // Print comma if not the last term
            if (i != n) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String args[]) {
        Tribonacci ob = new Tribonacci(); // Creating a new instance of Tribonacci class
        ob.accept(); // Calling the accept()
        ob.tribo(); // Calling the tribo()
    }
}
