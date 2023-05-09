
import java.util.Scanner;

class Video9_FOREACHLOOP3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] names = {"David",
                "Alenere",
                "Jasfer",
                "Ace",
                "Jaymar",
                "Emman"};

        System.out.print("Name To Search: ");
        String search = s.nextLine();

        for (String name : names) {
            if(name.equalsIgnoreCase(search)) {
                System.out.println("We Found " + name);
                break; //break na once found
            } else {
                System.out.println(name);
            }
        }
    }
}