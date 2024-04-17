import java.util.*;
class StringBuff{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.next();
        s1.concat("hey");
        System.out.println("String after concatenation is "+s1);
        StringBuffer sb=new StringBuffer("hello");
        sb.append("hi");
        System.out.println("string after appending is "+sb);

    }
}