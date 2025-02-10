package ex_11_Functions;
import java.math.BigInteger;
import java.util.Scanner;

public class Lab04_task {
    public static void main(String[] args){
        // create fn of sub,sum,div,mul
        // with parameter a,b (take the parameter from the user)
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int n1=0;
    if(sc.hasNextInt()) {
        n1 = sc.nextInt();
    }
    else{
        System.out.println("Please enter the integer only");
        System.exit(0); // to exit the program
    }
       // BigInteger a=sc.nextBigInteger();  use for big integers

        System.out.println("Enter the second number");
        int n2=0;
    if(sc.hasNextInt()) {
        n2 = sc.nextInt();
    }
    else{
        System.out.println("please enter the integer only");
        System.exit(0);
    }
        int res_sum=sum(n1,n2);
        int res_sub= sub(n1,n2);
        int res_mul=mul(n1,n2);
        int res_mod=mod(n1,n2);
        int res_div=div(n1,n2);
        System.out.println("Sum is "+res_sum);
        System.out.println("Difference of two numbers is "+res_sub);
        System.out.println("Multiplication of two numbers is "+res_mul);
        System.out.println("Modulus of two numbers is "+res_mod);
        System.out.println("Divisionof two numbers is "+res_div);

    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int c,int d){
        return c-d;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static int div(int a,int b){
        if (b==0){
            System.out.println("division by zero not allowed");
        }
        return a/b;
    }

    static int mod(int a, int b){
        return a%b;
    }
}
