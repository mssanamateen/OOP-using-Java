//Java Program using Third Construtor.
//Syntax: StringTokenizer(String str, String delim, boolean returnDelims)


import java.util.StringTokenizer;
import java.util.Scanner;

class StringThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string separated by commas: ");
        String s1 = sc.nextLine();
        /*When we pass true as the third parameter to the StringTokenizer constructor,
        it indicates that the delimiters should be treated as tokens and included in the result.*/
        StringTokenizer st = new StringTokenizer(s1, ",", true);
    
        System.out.println("Tokens extracted from the string using StringTokenizer: ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
