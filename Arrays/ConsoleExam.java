import java.io.Console;
/**
System.console() returns null if your application is not run in a terminal (though you can handle this in your application
secure password entry (hard to do cross-platform)
synchronisation (multiple threads can prompt for input and Console will queue them up nicely, whereas if you used System.in/out then all of the prompts would appear simultaneously).

*/
class ConsoleExam{
	public static void main(String[] args) {
		System.out.println("using console");
		Console con=System.console();
		if(con!=null){
			con.printf("enter your name");
			String name=con.readLine();
			con.printf("Hello,%s!%n",name);
		}else{
			System.out.println("console not available");
		}
	}
}