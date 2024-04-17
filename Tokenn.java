package tokenize;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenn{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your message");
		String msg=sc.nextLine();
		countDisp(msg);
		
		
	}
	public static void countDisp(String msg){
		StringTokenizer st=new StringTokenizer(msg," ");
		System.out.println("no of tokens are"+st.countTokens());
		while(st.hasMoreElements()){
			System.out.println(st.nextToken());
			
		}
	}
		
}
		