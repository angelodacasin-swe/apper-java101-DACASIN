
import java.util.Scanner;

class Video8_FORLOOP4userinput {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] names = {"David",
                "Alenere",
                "Jasfer",
                "Ace",
                "Patrick"};

        System.out.print("Name to Search: ");
        String search = s.nextLine(); // if integer, s.nextInt. Define String search variable.

        for (int i = 0; i < names.length; i++) {

            if (names[i].equalsIgnoreCase(search)) { //ignore case of what variable search is
                System.out.println("We Found " + names[i]);
                break; // Para mag break na pag nahanap na si "search". If no break, tuloy-tuloy until the end.
                // break is very useful for TIME COMPLEXITY
            } else { // Include else condition para hindi mag break agad.
                System.out.println(names[i]); //pag hindi si Ace yung lumabas, print the names
            }
        }
    }
}