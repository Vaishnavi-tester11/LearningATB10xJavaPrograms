package Task_29_Jan;
import java.util.Scanner;

public class Positive_Negative_01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n1=0 ;
        if(!sc.hasNextInt()) {
            System.out.println("PLease enter the integer only");
        }
        else {
            n1=sc.nextInt();
            if (n1 >= 0) {
                System.out.println("Positive");
            }
            else{
                System.out.println("Negative");
            }
        }

    }
}
