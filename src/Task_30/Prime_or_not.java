package Task_30;

import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int count=0;
        int i;
        for(i=1; i<=num; i++){
            if(num%i==0){
                count=count+1;
            }
        }
        if(count==2){
            System.out.println(num + " is Prime");
        }
        else{
            System.out.println(num + " is Not Prime");
        }
    }
}
