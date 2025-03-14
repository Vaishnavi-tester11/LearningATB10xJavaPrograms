package ex_13_Arrays;
import java.util.Scanner;

public class Lab08_userInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size=sc.nextInt();

        int[] num=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the number");
            num[i]=sc.nextInt();
        }

        System.out.println("---------------");
        for(int j=0; j<size; j++){
            System.out.println((num[j]));
        }
    }
}
