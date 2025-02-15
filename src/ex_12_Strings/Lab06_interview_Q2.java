package ex_12_Strings;

import java.sql.SQLOutput;

public class Lab06_interview_Q2 {
    public static void main(String[] args) {
        String s1 = "Hello";  // SCP =1
        String s4 = "Hello"; // 1

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");
        String s5 = new String("hello"); // OA =3

        // == ? comparision -> Strings -> check the location ref   }

//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s2 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s4 == s5);

        // equals (content) -> value
        // equals check the values
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s5));

    }
}