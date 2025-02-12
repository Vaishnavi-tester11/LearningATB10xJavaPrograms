package Task_29_Jan;

import java.util.Scanner;

public class Max_of_two_03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=0;
        if (!sc.hasNextInt()){
            System.out.println("please enter the valid input");
        }
        else{
            n1=sc.nextInt();
        }
        System.out.println("Enter the Second number");
        int n2=0;
        if(!sc.hasNextInt()){
            System.out.println("please enter the valid input");
        }
        else{
           n2=sc.nextInt();
        }
        // System.out.printf("%d & %d",n1,n2);

        if(n1>=n2){
            System.out.printf(" %d is Max Number ",n1);
        }
        else{
            System.out.printf(" %d is Max Number ",n2);
        }
    }
}
