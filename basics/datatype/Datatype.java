package basics.datatype;

public class Datatype {
    public static void main(String[] pp){
        int a=90;
        String s="hi";
        /**
         * getClass()- used to retrieve the runtime class of the object
         * getSimpleName()--it retrieves the simple name of the class without the package
         */
        System.out.println("datatype of s is "+s.getClass().getSimpleName());
        System.out.println("datatype of a is "+Integer.TYPE);
    }
}
