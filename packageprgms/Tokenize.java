import java.util.StringTokenizer;
import java.util.Scanner;
class Tokenize{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your message:");
		String msg=sc.next();
		StringTokenizer st1=new StringTokenizer(msg);
		StringTokenizer st2=new StringTokenizer("this lab you, have viva");
		StringTokenizer st3=new StringTokenizer("one for all! all for one","!");
		while(st1.hasMoreTokens()){
		System.out.println(st1.nextToken());
		}
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken(","));
		}
		while(st3.hasMoreTokens()){
			System.out.println(st3.nextToken());
		}
	}
}