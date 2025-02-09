package ex_08_If_else_conditions;

import java.util.Scanner;

public class Lab01_If {
    public static void main (String[] args){

       // int age=Integer.parseInt(args[0]);

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your Age here : ");
        int age=sc.nextInt();
        if (age >18){
            System.out.println("You are allowed to vote !");
        }
        else {
            System.out.println("You are not allowed to Vote !");
        }
            sc.close();
    }
}
