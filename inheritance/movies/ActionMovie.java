public class ActionMovie extends Movie{
	private String mainActor;
	public ActionMovie(String title,int year,String mainActor){
		super(title,year);
		this.mainActor=mainActor;
	}
	public void disp(){
		super.display();
		System.out.println("Main Actor"+mainActor);
	}
}
