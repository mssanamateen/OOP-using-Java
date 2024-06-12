public class Area{
	public void calculate(){
		System.out.println("nothing to calculate");
	}
	public void calculate(int x){
		System.out.println("circle area:"+Math.PI*Math.pow(x,2));
	}
	public void calculate(double x){
		System.out.println("circle perimeter"+2*Math.PI*x);
	}
	public void calculate(int x,int y){
		System.out.println("Rec Area"+x*y);
	}
	public static void main(String[] args){
		Area a1=new Area();
		a1.calculate();
		a1.calculate(10,20);
		a1.calculate(10.5);
		a1.calculate(10);
	}
}