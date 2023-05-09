
import java.util.Scanner;

class Video7_challenger {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("");

        int lives = 3; //user has 3 chances
        String answer; //call a String named answer

        while (lives > 0) { //Print below as long user as chances

            System.out.println("What is at the Center of Our Solar System?"); //Quiz Question
            System.out.print("Answer:"); //Let the user input his answer.
            answer = s.nextLine(); //Define answer variable. The nextLine() is method that stores the input.

            if (answer.equalsIgnoreCase("sun")) break; //Exit when user is correct
            else lives--;  //Deduct chances when user is wrong
            System.out.println(); //Additional space for aesthetics
        }
            if(lives > 0) System.out.println("You WON");
            else System.out.println("You LOST");
        }
    }