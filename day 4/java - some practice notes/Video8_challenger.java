//LOOP then may need hanapin sa array
import java.util.Scanner;

public class Video8_challenger {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // NOTE: paired by index same # of user and pass
        String[] usernames = {"User1",
                "User2",
                "User3",
                "User4",
                "User5"};

        String[] passwords = {"abcd",
                "abcd",
                "abcd",
                "abcd",
                "abcd"};

        System.out.print("Username: ");
        String username = s.nextLine();

        System.out.print("Password: ");
        String password = s.nextLine();

        boolean accountFound = false; //kasi hindi pa naman natin alam, pang initiate lang

        for (int i = 0; i < usernames.length; i++) {

            //username input ni user = usernames[i]
            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                accountFound = true;
                break;

            }
        }
        //better to put print conditions outside the FOR Loop
        if (accountFound) System.out.print("Welcome, " + username);
        else System.out.println("Account Not Found");
        }
    }