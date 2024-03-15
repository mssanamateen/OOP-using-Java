package basics.variables;
/**
 * local variables
 * Cricketer class 
 */
public class CricketerImpl {
    public static void main(String[] ar){
        Cricketer c1=new Cricketer();
        Cricketer c2=new Cricketer("MS Dhoni","India", 32);
        System.out.println(c2);
        c1.name="Sachin";
        c1.team="India";
        c1.age=55;
        System.out.println(c1);
    }
}
