import java.util.*;
public class factimpl{
      public static void main(String[] args){
int f=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number to find the factorial");
int n=sc.nextInt();
for(int i=1;i<=n;i++){
f=f*i;
}
System.out.println("factorial of"+n+" is"+f);
}
}
