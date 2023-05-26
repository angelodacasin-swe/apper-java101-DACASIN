package gcash;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App {
    private static final Map<String, User> users = new HashMap<>(); // Create HashMap

    // TODO: DISPLAY WELCOME MESSAGE AND THE OPTIONS
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("     Welcome to GCash Share-A-Load!");
        System.out.println("============================================");
        Scanner myScanner = new Scanner(System.in);
        initializeExistingUsers(); // Pre-populate the 'users' map with existing users

        // Create an infinite loop to repeatedly display the options until the user chooses Option 4: Exit
        while (true) {
            System.out.println();
            System.out.println("============================================");
            System.out.println("Enter 1 to Register a New gcash.User");
            System.out.println("Enter 2 to Share-A-Load");
            System.out.println("Enter 3 to Display All Users and Balances");
            System.out.println("Enter 4 to Exit");
            System.out.println("============================================");
            System.out.println();
            System.out.print("Enter your option here: ");
            int choice = myScanner.nextInt();
            myScanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1: registerUser(myScanner); break;
                case 2: shareLoad(myScanner); break;
                case 3: displayUsersBalances(); break;
                case 4: System.out.println();
                    System.out.println("Thank you for using GCash Share-A-Load. We hope to see you again soon!"); return;
                default: System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void initializeExistingUsers() {
        // List of existing users
        users.put("09190047571", new User("Bob", 100.00));
        users.put("09190047572", new User("Marley", 100.00));
        users.put("09190047573", new User("Seth", 100.00));
        users.put("09190047574", new User("Ryan",100.00));
        users.put("09190047575", new User("Fritz", 100.00));
    }

    // TODO: REGISTER AND VALIDATE USER
    private static void registerUser(Scanner myScanner) {
        boolean registrationSuccessful = false; // Registration is successful if each "if" statement return false
        while (!registrationSuccessful) {
            System.out.print("Enter mobile number: ");
            String mobileNumber = myScanner.nextLine();

            // Check if the mobile number is valid (11 digits)
            if (mobileNumber.length() != 11) {
                System.out.println("Invalid mobile number. Please enter your 11-digit mobile number.");
                continue; // Go to the next iteration of the loop to prompt again
            }

            // Check if the mobile number already exists
            if (users.containsKey(mobileNumber)) {
                System.out.println("That user already exists. Please use a different mobile number.");
                continue; // Go to the next iteration of the loop to prompt again
            }

            System.out.print("Enter Name: ");
            String name = myScanner.nextLine();

            // Check if the name is empty or blank
            if (name.isBlank()) {
                System.out.println("Invalid name. Try again.");
                continue; // Go to the next iteration of the loop to prompt again
            }

            User newUser = new User(name, 100.00); // New users by default will have a 100.00 balance
            users.put(mobileNumber, newUser);
            System.out.println("gcash.User registered successfully.");
            registrationSuccessful = true; // Set the flag to true to exit the loop
        }
    }

    // TODO: SHARE-A-LOAD
    private static void shareLoad(Scanner myScanner) {
        System.out.print("Enter sender's mobile number: ");
        String senderNumber = myScanner.nextLine();

        User sender = users.get(senderNumber);
        if (sender == null) {
            System.out.println("Sender is not registered.");
            return;
        }

        System.out.print("Enter recipient's mobile number: ");
        String recipientNumber = myScanner.nextLine();

        User recipient = users.get(recipientNumber);
        if (recipient == null) {
            System.out.println("Recipient is not registered.");
            return;
        }

        if (senderNumber.equals(recipientNumber)) {
            System.out.println("Sender and recipient cannot be the same.");
            return;
        }

        System.out.print("Enter amount to share: ");
        double amount = myScanner.nextDouble();
        myScanner.nextLine(); // Consume newline character

        if (amount <= 0) {
            System.out.println("Invalid amount. Try again.");
            return;
        }

        if (sender.getBalance() < amount) {
            System.out.println("Insufficient balance");
            return;
        }

        sender.setBalance(sender.getBalance() - amount);
        recipient.setBalance(recipient.getBalance() + amount);

        System.out.println("Load shared successfully.");
    }

    // TODO: DISPLAY USERS AND THEIR RESPECTIVE BALANCE
    private static void displayUsersBalances() {
        System.out.println("Users and Balances:");
        for (Map.Entry<String, User> entry : users.entrySet()) {
            String mobileNumber = entry.getKey();
            User user = entry.getValue();
            System.out.println(mobileNumber + " | " + user.getName() + " | Balance: " + user.getBalance());
        }
    }
}