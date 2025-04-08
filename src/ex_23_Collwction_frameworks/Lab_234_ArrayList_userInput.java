package ex_23_Collwction_frameworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_234_ArrayList_userInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String> names=new ArrayList();
        ArrayList<Integer> ages=new ArrayList();

        String continueInput="Y";

        while(continueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter the Name :");
            String name=sc.next();
            names.add(name);

            System.out.println("Enter the Age : ");
            int age=sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter another record? (Y/N): ");
            continueInput=sc.nextLine();
        }

        for(Object o1:names){
            System.out.println(o1);
        }

        for(Object o2: ages){
            System.out.println(o2);
        }

        sc.close();
    }
}
