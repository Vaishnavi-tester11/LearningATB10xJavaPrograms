package ex_08_If_else_conditions;

import java.util.Scanner;

public class Lab05_if_elseif_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the Second number");
        int n2=sc.nextInt();

        if (n1>n2){
            System.out.println("n1");
        } else if (n2>n1) {
            System.out.println("n2");
        }
        else {
            System.out.println("equal");

        }
        sc.close();


    }
}
