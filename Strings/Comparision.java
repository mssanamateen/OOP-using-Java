import java.util.Scanner;
class Comparision{
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your subject");
		String subj=sc.next();
		String sch=new String("python");
		if(subj.equals("java")){
			System.out.println("patience is needed");
		}
		else{
			System.out.println("dont waste time");
		}
	}
}
		