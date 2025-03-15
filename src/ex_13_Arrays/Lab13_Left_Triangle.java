package ex_13_Arrays;

import java.util.Scanner;

public class Lab13_Left_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r=sc.nextInt();

        for(int i=r; i>0; i--){
            for(int j=i; j<=i ;j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
