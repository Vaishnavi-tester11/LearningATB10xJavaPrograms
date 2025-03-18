package ex_15_OOPs_constructor;

import java.util.Scanner;

public class Lab04_Car2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the model name for Tesla");
        String model_name=sc.next();
        System.out.println("Enter the year of the model");
        int year_created=sc.nextInt();
        Car2 tesla=new Car2(model_name,year_created);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        System.out.println(" ------ ");


        Car2 nano=new Car2();
        System.out.println(nano.model);
        System.out.println(nano.year);

        Car2 nano1=new Car2("Nano tat",2014);
        System.out.println(nano1.model);
        System.out.println(nano1.year);
    }
}
