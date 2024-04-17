package AIDSIIB.batches;
import AIDSIIB.*;
public class Batch1{
	int firstRoll,lastRoll;
	public Batch1(int fr,int lr){
		this.firstRoll=fr;
		this.lastRoll=lr;
	}
	public void displayBatch1(){
		System.out.println("Batch 1 starts from"+firstRoll+"to"+lastRoll);
	}
}