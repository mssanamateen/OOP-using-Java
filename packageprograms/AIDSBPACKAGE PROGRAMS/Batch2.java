package AIDSIIB.batches;
import AIDSIIB.*;
public class Batch2{
	int firstRoll,lastRoll;
	public Batch2(int fr,int lr){
		this.firstRoll=fr;
		this.lastRoll=lr;
	}
	public void displayBatch2(){
		System.out.println("Batch 2 starts from"+firstRoll+"to"+lastRoll);
	}
}