public class ChekdExcep {

    public static void main(String[] args) {
        String className = "ChekdExcep";

        try {
            // Attempting to load the class dynamically
            Class<?> clz = Class.forName(className);
            System.out.println("Class loaded successfully: " + clz.getName());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + className);
        }
    }
}
