import java.util.Scanner; //import Scanner class for code use later

class Homework2 {
    public static void main(String[] args) {
        java.util.Scanner myScanner = new Scanner(System.in); // Start Scanner object named as myScanner to read user input
        System.out.print(" Number: "); // Prompt the user to input a number. This will print Number: <input of user>
        int number = myScanner.nextInt(); // Read the input of the user and store it in a variable named isPrime

        // Conditional Statements
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) { // If the number is <= 1, it is automatically not a prime number
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // This will check if the number is divisible by any number between 2 and the square root of the number.
            if (number % i == 0) {  // If the remainder of the number divided by 'i' is equal to 0, then it is divisible -- not prime.
                return false; // If divisible by any number in the range, it is not prime.
            }
        }
        return true; // If not divisible by any number in the range, it is prime.
    }
}