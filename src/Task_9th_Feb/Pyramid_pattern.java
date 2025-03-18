package Task_9th_Feb;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
       int rows=sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }

            }
            System.out.println(" ");
        }
    }
}
