package Task_30;

import java.util.Scanner;

public class Alphabet_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the character");
        char c1=sc.next().charAt(0);

        if(Character.isLetter(c1)){
            System.out.println(c1 + "  is Alphabet");
        }
        else{
            System.out.println(c1 + "  is Not Alphabet");
        }
        sc.close();
    }
}
