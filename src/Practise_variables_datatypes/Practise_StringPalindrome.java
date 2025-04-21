package Practise_variables_datatypes;

import java.util.Scanner;

public class Practise_StringPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String cleaned=s.replaceAll("[^a-zA-Z]",""); // non letters(special characters !, space) replaced with ""

       int len=cleaned.length();
        System.out.println("Length is "+len);

       String rev="";
       for(int i=len-1; i>=0;i--){
           rev = rev + cleaned.charAt(i);
       }

        System.out.println(rev);

       if(cleaned.equalsIgnoreCase(rev)){
           System.out.println(s+" Yes, ! its polindrome");
       }
       else{
           System.out.println(s+" It's not polindrome");
       }
    }
}
