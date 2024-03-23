import java.util.*;
public class armstrong{
	public static void main(String[] arg){
		int sum=0,n,orn;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		orn=n;
		while(orn!=10){
			int rem=orn%10;
			sum+=rem*rem*rem;
			orn/=10;
		}
		if(sum==n){
			System.out.println("armstrong number");
		}else{
			System.out.println("not armstrong number");
		}
		sc.close();
	}
}