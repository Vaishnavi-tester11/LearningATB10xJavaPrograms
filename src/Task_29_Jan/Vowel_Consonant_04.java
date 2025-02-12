package Task_29_Jan;

import java.util.Scanner;

public class Vowel_Consonant_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the character");
        char c2=sc.next().charAt(0);
        char c1=Character.toLowerCase(c2);

        if(!Character.isLetter(c1)){
            System.out.println("please enter an alphabetical character");
        }
        else{
            if( c1 == 'a' || c1 == 'e' || c1=='i' || c1=='o' || c1=='u'){
                System.out.printf(" %c is Vowel ",c2);
            }
            else{
                System.out.printf(" %c is Consonant ",c2);
            }
        }




    }
}
