package Task_30;

import java.util.Scanner;

public class small_of_two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n1=sc.nextInt();
        System.out.println("Enter the number");
        int n2=sc.nextInt();
        if(n1<n2){
            System.out.printf("n1 is small number & value is %d ",n1);
        }
        else if(n2<n1){
            System.out.printf("n2 is small number & value is %d ",n2);
        }
        else{
            System.out.println("both are equal");
        }


    }


}
