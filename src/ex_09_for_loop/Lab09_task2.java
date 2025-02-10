package ex_09_for_loop;
import java.util.Scanner;


public class Lab09_task2 {
    public static void main(String[] args){
        // factorial of given number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to do factorial");
        // Input validation
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }

        int fact = sc.nextInt();

        // Handle negative numbers
        if (fact < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        int res=1;
        for(int i=fact; i>0; i--){
            res=res * i;
        }
        System.out.printf("Factorial of %d is %d ",fact,res);
    }
}
