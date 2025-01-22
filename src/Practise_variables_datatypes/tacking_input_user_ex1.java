package Practise_variables_datatypes;

import java.util.Scanner;

public class tacking_input_user_ex1 {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        System.out.println(" Your Name :");
        String name = obj.next();

        System.out.println("Age: ");
        int Age= obj.nextInt();

        System.out.println("Salary: ");
        float Salary= obj.nextFloat();

        System.out.printf("Your Name is %s, your Age is %d , your Salary is %f",name,Age,Salary);
        obj.close();
    }
}
