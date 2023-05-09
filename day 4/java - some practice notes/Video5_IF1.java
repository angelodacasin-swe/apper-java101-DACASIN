package javaFundamentals;

import java.util.Scanner;

class Video5_IF1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print(" Enter Greetings : ");
            String greet = s.nextLine();

        if(greet.equalsIgnoreCase("Hello")) {
            System.out.println("Hi");
        }
    }
}
