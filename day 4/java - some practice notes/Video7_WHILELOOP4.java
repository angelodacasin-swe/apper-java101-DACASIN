
import java.util.Scanner;

class Video7_WHILELOOP4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] names = {"David",
                        "Alenere",
                        "Patrick",
                            "Ace",
                        "Jasfer"};

        System.out.print("Name to Search : ");
        String search = s.nextLine();

        int i = 0;

        while(i < names.length) {

            if(names[i].equalsIgnoreCase(search)) {
                System.out.println("We Found " + names[i]);
                break;
            }else {
                System.out.println(names[i]);
            }
            i++;
        }
    }
}