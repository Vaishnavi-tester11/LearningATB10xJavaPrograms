package Practise_variables_datatypes;

import java.util.Scanner;

public class Prime_Or_Not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value to find weather is it prime or not");
        int p=sc.nextInt();
        int count=0;
        int count2=0;
        if(p==1){
            System.out.println("one is not prime number");
        }
        else {
            for (int i = 1; i <= p; i++) {
                if (p % i == 0) {
                    count = count + 1;
                } else {
                    count2 = count2 + 1;
                }
            }
        }
            if (count == 2) {
                System.out.printf("%d is PrimeNumber it's Having %d factors", p,count);
            }
            else{
                System.out.printf("%d is Not a PrimeNumber it's having %d factors ",p,count);
            }

    }
}
