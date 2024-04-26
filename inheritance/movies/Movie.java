public class Movie{
	String title;
	int year_of_release;
	Movie(String title,int year){
		this.title=title;
		this.year_of_release=year;
	}
	public void display(){
		System.out.println("Title:"+title);
		System.out.println("Year:"+year_of_release);
	}
}