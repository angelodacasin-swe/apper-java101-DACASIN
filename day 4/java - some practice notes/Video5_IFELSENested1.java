package javaFundamentals;

import java.util.Scanner;

class Video5_IFELSENested1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(" Enter Age : ");

        int age = s.nextInt();
        boolean isVerified = true;

        if (age >= 18) {
            System.out.println("You Have Access");

            if(isVerified) {        // you can also make it (true) or (false)
                System.out.println("Qualified");
            }else{
                System.out.println("You Are Not Qualified");
            }
        }
    }
}
