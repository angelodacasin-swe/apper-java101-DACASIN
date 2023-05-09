// PRACTICE DAY 1 PART 3 -3 (Challenger)

// Import the Scanner class. This is used to read input from the user.
import java.util.Scanner;

class Video3_challenger {
    public static void main(String[] args) {

        float numOne; // name variable 1
        float numTwo; // name variable 2
        float result;

        Scanner s = new Scanner(System.in);

        System.out.print("First Number : "); // this is a prompt to type
        numOne = s.nextFloat();

        System.out.print("Second Number : "); // this is a prompt to type
        numTwo = s.nextFloat();

        result = numOne * numTwo;

        System.out.println(""); // Space for organization
        System.out.println(numOne + " * " + numTwo + " = " + result);
    }
}