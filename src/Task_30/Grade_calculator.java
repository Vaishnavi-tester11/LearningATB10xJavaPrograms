package Task_30;

import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the marks");
        int marks=0;
        if(!sc.hasNextInt()){
            System.out.println("please enter the integer type");
        }
        else{
            marks=sc.nextInt();
            if((marks>=90) && (marks<100)){
                System.out.println(" A+ ");
            }
            else if((marks >= 80) && (marks<90)){
                System.out.println(" A");
            }
            else if((marks >= 70) && (marks<80)){
                System.out.println(" B");
            }
            else if((marks >= 60) && (marks<70)){
                System.out.println(" C");
            }
            else if((marks >= 50) && (marks<60)){
                System.out.println("D");
            }
            else if((marks >= 40) && (marks<50)){
                System.out.println("E ");
            }
            else if ((marks<=0) || (marks>=100)){
                System.out.println( " You are really Awsome !!");
            }
            else{
                System.out.println(" Fail");
            }
        }
    }
}
