package Task_30;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to find Leap year or not");
        int year=0;

        if(!sc.hasNextInt()){
            System.out.println("please enter the integer datatype");
            return;
        }
        else{
            year=sc.nextInt();

            if(year==0){
                System.out.println("You are so silly ! buddy, Year can't be Zero");
            }
            else{
                if(year % 100 ==0){
                    System.out.printf("%d is not Leap Year ",year);
                }
                else if(( year % 4 ==0) || (year % 400 ==0)){
                    System.out.printf("%d is Leap Year ",year );
                }
                else{
                    System.out.println("It's not leap year");
                }
            }

        }

    }
}
