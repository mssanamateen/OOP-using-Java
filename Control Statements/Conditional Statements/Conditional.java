public class Conditional {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        if (num1 > num2 && num1 > num3) {
            System.out.printf(" %d is Greater", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf(" %d is Greater", num2);
        } else {
            System.out.printf(" %d is Greater", num3);
        }
    }
}
