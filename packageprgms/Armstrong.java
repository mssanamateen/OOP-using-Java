import java.util.*;
public class Armstrong{
    public static void main(String[] args){
        int sum=0,n,orn;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        orn=n;
        while(orn!=0){
            int rem=orn%10;
            sum+=rem*rem*rem;
            orn/=10;
        }
        if(sum==n){
            System.out.println("It is an Armstrong Number.");
        }
        else{
            System.out.println("It is not an Armstrong Number.");
        }
        sc.close();
    }
}