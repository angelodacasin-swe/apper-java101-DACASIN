
public class Video12_Methods2 {

    // Global Variables are declared in the class
    static String section = "A"; //laging lagyan ng static
    static int num = 100;

    public static void main(String[] args) {
        // Local Variables
        saySection();
        sayNumber();
    }

    static void saySection() {
        System.out.println(section); //error sa una pero we need to make section static
    }

    static void sayNumber() {
        System.out.println(num);
    }
}
