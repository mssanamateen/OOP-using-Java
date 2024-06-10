class Person{
	Person(){
		System.out.println("Person class constructor");
	}
}
class EthicalHacker extends Person{
	EthicalHacker(){
		super();
		System.out.println("Hack the box");
	}
}

class SuperImpl{
	public static void main(String[] args){
		EthicalHacker eh=new EthicalHacker();
	}
}