public class Video8_FORLOOPBreak1 {
    public static void main(String[] args) {
        String[] names = {"David",
                "Alenere",
                "Jasfer",
                "Ace",
                "Patrick"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("I am " + names[i]);
            break; // USELESS for now since it breaks the code after first run
        }
    }
}