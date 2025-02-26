package Task_30;

import java.util.Scanner;

public class Valid_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the triangle");
        int s1=sc.nextInt();
        System.out.println("Enter the side of the triangle");
        int s2=sc.nextInt();
        System.out.println("Enter the side of the triangle");
        int s3=sc.nextInt();

        if ( (s1+s2 > s3) && (s2+s3 > s1) && (s1+s3 > s2)){
            System.out.println("Triangle is Valid based on the given values");
        }
        else{
            System.out.println("Triangle is not possible");
        }

    }
}
