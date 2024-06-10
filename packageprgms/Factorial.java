import java.util.*;
public class Factorial{
    public static void main(String[] args){
        int f=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Fcatorial of "+n+" is "+f);
    }
}