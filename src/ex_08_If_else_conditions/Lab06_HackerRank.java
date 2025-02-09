package ex_08_If_else_conditions;

import java.util.Scanner;

public class Lab06_HackerRank {
    public static void main(String[] args) {
        // 1. i/p -> int , using Scanner class
        //    o/p -> char,

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks: ");

        if (!sc.hasNextInt()) {
            System.out.println("Please enter the Valid Number");
        } else {
            char grade='F';
            int n = sc.nextInt();

            if ((n <= 100) && (n >= 90)) {
                grade ='A';
            } else if ((n <= 89) && (n >= 80)) {
                grade ='B';
            } else if ((n <= 79) && (n >= 70)) {
                grade ='C';
            } else if ((n <= 69) && (n >= 60)) {
                grade ='D';
            }else if((n<=0) || (n>100)){
                grade='O';
                System.out.println("You are vere level");
            }
            else {
                grade ='F';
            }
            System.out.printf("Your Grade is %c",grade);
            System.out.println();
            sc.close();
        }

    }
}
