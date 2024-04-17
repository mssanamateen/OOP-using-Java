package AIDSIIB;
public class Subjects {
    public String subj[]={"FAI","SAC","OS","HVPE","JAVA LAB","SDCII","OS LAB","SAC LAB"};
    public static void main(String[] args){
        Subjects so=new Subjects();
        for(int i=0;i<so.subj.length;i++){
            System.out.println(so.subj[i]);
        }
    }
}
