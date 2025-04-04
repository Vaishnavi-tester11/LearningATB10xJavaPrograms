package ex_21_Exception;

import java.io.FileInputStream;

public class Lab_206 {
    public static void main(String[] args) {
        // Checked exceptions --> JVM knows

       // FileInputStream fp=new FileInputStream("c://log.txt");
        System.out.println("1");
        try{
            int a=10/0;
            //System.out.println("a="+a);
        }catch (Exception e){
            e.printStackTrace(); // print full problem
            System.out.println(e.getMessage()); // message will give
        }
        System.out.println("2");


    }
}
