// PRACTICE DAY 1 PART 4 

// Import the Scanner class. This is used to read input from the user.
import java.util.Scanner;

class Video4_arrays {
    public static void main(String[] args) {

        String studentNames[] = {"David",
                "Alenere",
                "Jasfer",
                "Ace",
                "Patrick"}; //remember start at 0

        studentNames[0] = "Emman";
        System.out.println(studentNames[0]); //Assign Array Element

        System.out.println(studentNames[3]); //Reading Array Element

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(numbers[2]); //Reading Array Element
        System.out.println(numbers[5]); //Reading Array Element

        System.out.println(numbers[2] + numbers[5]); //remember start at 0

    }
}