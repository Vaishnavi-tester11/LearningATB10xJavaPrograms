package Practise_variables_datatypes;

public class Decrement {
    public static void main(String[] args) {
        int a=10;
        int res=a--;
        System.out.println(res);
        System.out.println(a);
        // a=9
        int res1=--a;
        System.out.println(res1); //8
        System.out.println(a); // 8

        int b=20;
        System.out.println(--b + b++ + b--); // 58
        System.out.println(b); // 19

    }
}
