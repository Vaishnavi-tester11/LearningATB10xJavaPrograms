package ex_21_Exception;

import java.util.Scanner;

public class Lab_211 {
    public static void main(String[] args) {
        Scanner sc=null;
        sc=new Scanner(System.in);
        int v=sc.nextInt();
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            sc.close();
            System.out.println("closing Sc!!");
        }
    }
}
