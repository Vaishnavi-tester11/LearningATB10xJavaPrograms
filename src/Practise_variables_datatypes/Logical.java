package Practise_variables_datatypes;

public class Logical {
    public static void main(String[] args) {
        // &&,||,!
        boolean a=true;
        boolean b=true;
        boolean c= true || false;
        int x=20;
        System.out.println(c);
        System.out.println(!a);
        System.out.println(!!b);
        System.out.println(!!!b);
        System.out.println(!!(x>10 || x<20));

//        compound operator
        x+=30;
        System.out.println(x);
        x-=10;
        System.out.println(x);
    }
}
