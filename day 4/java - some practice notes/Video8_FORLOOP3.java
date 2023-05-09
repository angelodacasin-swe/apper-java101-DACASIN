public class Video8_FORLOOP3 {
    public static void main(String[] args) {
        String[] names = {"David",
                "Alenere",
                "Jasfer",
                "Ace",
                "Patrick"};

        for (int i = 0; i < names.length; i++) {

            if(names[i].equalsIgnoreCase("ace")) {
                System.out.println("We Found " + names[i]);
                break; // Para mag break na pag nahanap na si Ace. If no break, tuloy-tuloy until the end.
                        // break is very useful for TIME COMPLEXITY
            } else { // Include else condition para hindi mag break agad.
                System.out.println(names[i]); //pag hindi si Ace yung lumabas, print the names
            }
        }
    }
}