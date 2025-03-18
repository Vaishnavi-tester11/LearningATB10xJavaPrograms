package Task_9th_Feb;

import java.util.Scanner;

public class Left_Triangle_star_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows=sc.nextInt();

        for(int i=rows; i>=1; i--){
            for(int j=i; j>0 ;j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
