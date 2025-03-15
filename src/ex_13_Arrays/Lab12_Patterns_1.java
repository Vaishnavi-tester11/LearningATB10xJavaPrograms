package ex_13_Arrays;
import java.util.Scanner;

public class Lab12_Patterns_1 {
    public static void main(String[] args) {

        // Right angle triangle

        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the No of rows");
        int r=sc.nextInt();

        for(int i=0; i<r; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        sc.close();
    }
}
