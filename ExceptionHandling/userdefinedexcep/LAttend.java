import java .io.*;
class LAttend extends Exception{
	LAttend(String str){
		super(str);
	}
	public static void main(String[] args){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the held classes");
			double h=Double.parseDouble(br.readLine());
			System.out.println("enter the attended classes");
			double at=Double.parseDouble(br.readLine());
			double p=(at/h)*100;
			System.out.println("percentage is "+p);
			if(p<75){
				LAttend lat=new LAttend("You are not allowed for JAVA LAB exam");
				throw lat;
			}
	}catch(LAttend la){
		System.out.println(la);
	}
	catch(IOException ie){
		System.out.println(ie);
	}
	}
}