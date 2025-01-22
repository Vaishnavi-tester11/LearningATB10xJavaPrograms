package Practise_variables_datatypes;

import java.util.Scanner;

public class taking_input_Scanner{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println(" Enter the Age value : ");
        int Age=obj.nextInt();

        System.out.println( Age>=25 ? "Allowed to go to Goa" : "NOt Allowed");

        obj.close();
    }
}
