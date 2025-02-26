package Task_30;
import java.util.Scanner;


public class Largest_of_three_01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number ");
        int n1=0;
        if (sc.hasNextInt()) {
             n1 = sc.nextInt();
        }
        else{
            System.out.println("please enter the valid integer");
            return;
        }
        int n2=0;
        System.out.println("Please enter the number ");
        if(sc.hasNextInt()){
             n2=sc.nextInt();
        }
        else{
            System.out.println("please enter the valid integer");
            return;
        }
        int n3=0;
        System.out.println("Please enter the number ");
        if(sc.hasNextInt()) {
            n3 = sc.nextInt();
        }
        else{
            System.out.println("please enter the valid integer");
            return;
        }

        if((n1>=n2) && (n1>=n3)){
            System.out.printf("n1 is greater number the value is %d ",n1);
        }
        else if((n2>=n3) && (n2>=n1)){
            System.out.printf("n2 is greater number tha value is %d ",n2);
        }
        else{
            System.out.printf(" n3 is greater number the value is %d ",n3);
        }
    }

}
