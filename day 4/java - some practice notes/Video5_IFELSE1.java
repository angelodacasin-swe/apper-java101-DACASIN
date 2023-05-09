package javaFundamentals;

import java.util.Scanner;

class Video5_IFELSE1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print(" Enter Age: ");
        int age = s.nextInt();

        if(age >= 18) {
            System.out.println("You Have Access");
        }else {
            System.out.print("You Don't Have Access");
        }
    }
}
