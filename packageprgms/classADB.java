import AIDSIIB.CR;
import AIDSIIB.GoodStudents;
import AIDSIIB.batches.*;
class classADB{
	public static void main(String[] args){
		CR c1=new CR("SIRI",88);
		CR c2=new CR("TAQI",00);
		System.out.println("Welcome to AIDSIIB");
		System.out.println("CR1 details");
		c1.CRdetails();
		System.out.println("CR2 details");
		c2.CRdetails();
		
		Batch1 b1=new Batch1(66,101);
		b1.displayBatch1();
		Batch2 b2=new Batch2(102,129);
		b2.displayBatch2();

		GoodStudents gs=new GoodStudents("siri",88);
		gs.goodStudents();
	}
}