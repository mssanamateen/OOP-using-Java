class ArithmeticMain{
	public static void main(String[] args){
		try{
			int num=10/0;
			System.out.println(num);
		}
		catch(Exception e){
			System.out.println("parent class exceptionhandles"+e);
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
	}
}