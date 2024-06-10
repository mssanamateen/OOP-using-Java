package AIDSIIB;
public class CR{
	String name;
	int rn;
	public CR(String nam,int rno){
		this.name=nam;
		this.rn=rno;
	}
	public void CRdetails(){
		System.out.println("CR details");
		System.out.println("name:"+name);
		System.out.println("rno:"+rn);
	}
}