
// Import the Scanner class. This is used to read input from the user.
import java.util.Scanner;

class Video4_arrays2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String employeeNames[] = new String[20];
        int evenNumbers[] = new int[10];

        System.out.print(" Enter Employee Name : ");
        employeeNames[0] = s.nextLine(); //nextLine pang String s.nextint if integer

        System.out.println(employeeNames[0]); //print user input

    }
}