package arithmeticop;
public class Addition{
	private int d1,d2;
	public Addition(int n1,int n2){
		this.d1=n1;
		this.d2=n2;
	}
	public void sum()
	{
		System.out.println("sum of two given numbers is"+(d1+d2));
	}
}