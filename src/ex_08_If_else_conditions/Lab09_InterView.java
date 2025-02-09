package ex_08_If_else_conditions;
import java.util.Scanner;

public class Lab09_InterView {
    public static void main(String[] args){
        // switch case wilth JDK >13
        // matching with multiple conditions
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int itemcode=sc.nextInt();

        switch(itemcode){
            case 1,2,8:
                System.out.println("This is Electronic Gaget");
                break;
            case 5,6,9:
                System.out.println("This is Mechanical");
                break;
            default:
                System.out.println("None");

        }
    }

}
