package basics;
import java.util.*;
class ArithmeticOp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two integers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        Arith a1=new Arith(a,b);
        a1.add();
        a1.sub();
    }
}
class Arith{
    int n1,n2;
    Arith(int a,int b){
        this.n1=a;
        this.n2=b;
    }
    void add(){
        System.out.println("addition result:"+(n1+n2));
    }
    void sub(){
         System.out.println("subtraction result:"+(n1-n2));
    }
}