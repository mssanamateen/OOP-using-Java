package basics.variables;
/**
 * Local variables
 */
public class Cricketer {
    String name;
    String team;
    int age;
    Cricketer(){
        name="";
        team="";
        age=0;
    }
    Cricketer(String n, String t, int a){
        name=n;
        team=t;
        age=a;
    }
    public String toString(){
        return "this is"+name+"of"+team;
    }
}
