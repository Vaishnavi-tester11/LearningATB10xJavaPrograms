package ex_21_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_214 {
    public static void main(String[] args) {

        try {
            FileInputStream fc=new FileInputStream("c://a.log");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Anyway I will execute");
        }
    }
    }


