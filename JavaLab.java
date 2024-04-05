
import java.util.*;
import AIDSIIB.Subjects;
public class JavaLab {
    public static void main(String[] arg){
        Subjects su=new Subjects();
        Scanner sc=new Scanner(System.in);
        for(String i: su.subj){
            if(i.equals("JAVA LAB")){
                System.out.println("Faculty for "+i+" Sana Mam");
            }
        }
    }
}
