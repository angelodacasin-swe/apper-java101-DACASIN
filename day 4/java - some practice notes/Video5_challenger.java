package javaFundamentals;

import java.util.Scanner;

class Video5_challenger {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print(" Math : ");
        float mathGrade = s.nextFloat();

        System.out.print(" Science : ");
        float scienceGrade = s.nextFloat();

        System.out.print(" English : ");
        float englishGrade = s.nextFloat();

        System.out.print(" Computer : ");
        float computerGrade = s.nextFloat();

        float average = (mathGrade + scienceGrade + englishGrade + computerGrade) / 4;

        System.out.println(); // blank space for aesthetics
        System.out.println("Average : " + average); // concatanate average w result

        if(average > 100) {
            System.out.println("Invalid Grade");
        }else if(average >= 98) {
            System.out.println("With Highest Honors");
        }else if(average >= 95) {
            System.out.println("With High Honors");
        }else if(average >= 90) {
            System.out.println("With Honors");
        }else if(average >=75) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}