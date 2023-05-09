package javaFundamentals;

import java.util.Scanner;

class Video5_IFELSENested2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int age = 18;
        boolean isVerified  = true;

        if(age >=18 && isVerified) {
            System.out.println("You Have Access and is Qualified");
        }else if(age >= 18 && !isVerified) {
            System.out.println("You Have Access but not Qualified");
        }else{
            System.out.println("Access Denied");
        }
    }
}