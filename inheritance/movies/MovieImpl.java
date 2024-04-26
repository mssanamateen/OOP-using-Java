public class MovieImpl{
	public static void main(String[] args){
		Movie mv=new Movie("Assassin Creed",2016);
		mv.display();
		ActionMovie am=new ActionMovie("Max Payne",2008,"Mark Wahlberg");
		am.display();
	}
}