package basics.controlstatements;
import java.util.*;
/**
 * Java program to accept input and store in arrays
 */
public class WhileExam {
    public static void main(String[] p){
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("enter the limit");
        int n=sc.nextInt();
        System.out.println("enter the marks");
        int marks[]=new int[n];
        while(i<n){
            marks[i]=sc.nextInt();
            i++;
        }
        System.out.println("the marks are");

        for(int nn : marks){
            System.out.println(nn);
        }
        sc.close();
    }
}
