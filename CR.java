package AIDSIIB;
import java.util.Scanner;
class CR{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of CR");
        String Cr1=sc.next();
        if(Cr1.equalsIgnoreCase("siri")){
            System.out.println("roll no of "+Cr1+"is 88");
        }else{
            System.out.println("cr IS "+Cr1);
        }
    }
}