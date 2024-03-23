import java.util.*;
public class armstrongimpl{
public static void main(String[] ar){
int sum=0,n,orn;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
n=sc.nextInt();
orn=n;
while(orn!=0){
int rem=orn%10;
sum+=rem*rem*rem;
orn/=10;
}
if(sum==n)
{
System.out.println("the entered num is an armstrong");
}
else
{
System.out.println("the entered number is not armstrong");
}
sc.close();
}
}

