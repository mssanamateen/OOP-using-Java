package AIDSIIB;

public class GoodStudents{
	String name;
	int rno;	
	public GoodStudents(String nam,int rn){
		this.name=nam;
		this.rno=rn;
	}
	public void goodStudents(){
		System.out.println("The good student is:");
		System.out.println(name);
		System.out.println(rno);
	}
}