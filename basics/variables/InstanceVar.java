package basics.variables;
/**
 * Call By Reference
 * When you pass an object to a method, changes to the object inside a method do affect
 * the object used as an argument.
 */
public class InstanceVar {
    int a,b,c;
    InstanceVar(int i,int j){
        a=i;
        b=j;
    }
    int addition(InstanceVar inv){
        c=inv.a+inv.b;
        return c;
    }
    public static void main(String ar[]){
        InstanceVar inv1=new InstanceVar(3, 2);
        System.out.println("Before Call"+inv1.a+" "+inv1.b);
        
        int c=inv1.addition(inv1);
        System.out.println("result is"+c);
        inv1.a=4;
        inv1.b=2;
        int res=inv1.addition(inv1);
        System.out.println("After Call"+inv1.a+" "+inv1.b);
        System.out.println("result is"+res);
    }
    
}
