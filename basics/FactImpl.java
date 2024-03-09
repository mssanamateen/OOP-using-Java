package basics;
import java.io.*;

public class FactImpl {
    public static void main(String[] args) throws IOException{
        int f=1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number to find the factorial");
        int n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("factorial of "+n+" is "+f);
    }
}

