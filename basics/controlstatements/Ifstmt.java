package basics.controlstatements;
import java.util.*;
public class Ifstmt {
    public static void main(String[] ar){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the age");
            int age=sc.nextInt();
            if(age>=18){
                System.out.println("You are allowed to vote");
            }
            else{
                System.out.println("You are not eligible");
            }
            sc.close();
    }
    
}
