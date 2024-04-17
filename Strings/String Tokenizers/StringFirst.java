//Java Program using first Constructor(using Single parameter).

import java.util.StringTokenizer;
class StringFirst {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("This statement is passed directly inside the class.");
        System.out.println("Tokens extracted from the string using StringTokenizer: ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
