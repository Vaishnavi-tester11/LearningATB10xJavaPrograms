package ex_08_If_else_conditions;

import java.util.Scanner;

public class Lab04_even_odd {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  Number");
        int n1=sc.nextInt();

        if (n1%2==0){
            System.out.printf("%d is even number",n1);
        }
        else{
            System.out.printf("%d is odd number",n1);
        }
        sc.close();

    }
}
