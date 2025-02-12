package Task_29_Jan;

import java.util.Scanner;

public class Eligible_to_vote_05 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the age(in years) to check eligibility to vote");
        int age=0;
        if(!sc.hasNextInt()){
            System.out.println("please enter the valid input");
        }
        else{
            age= sc.nextInt();
            if(age>=18){
                System.out.printf("You age is %d , so you are eligible for voting",age);
            }
            else{
                System.out.println("you are not eligible");
            }
        }
    }
}
