class Job{
	String position="Ethical Hacker";
	
}
class Dream extends Job{
	String sname="Maviya";
	void display(){
		System.out.println("name:"+sname);
		System.out.println(super.position);
	}
}
class DreamImpl{
	public static void main(String[] args){
		Dream d=new Dream();
		d.display();
	}
}