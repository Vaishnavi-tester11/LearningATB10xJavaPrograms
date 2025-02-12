package Task_29_Jan;

import java.util.Scanner;

public class Even_Odd_02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=0;

        if(!sc.hasNextInt()){
            System.out.println("Enter the integer");
        }
        else{
            num=sc.nextInt();
            if(num%2==0){
                System.out.printf("%d is Even number",num);
            }
            else{
                System.out.printf(" %d is Odd number ",num);
            }
        }
    }
}
