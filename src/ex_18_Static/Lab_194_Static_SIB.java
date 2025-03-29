package ex_18_Static;

public class Lab_194_Static_SIB {
    public static void main(String[] args) {
        A sc=new A();
        System.out.println(A.a);
        A.m1();
    }
}

class A{
    static{
        System.out.println("Called only once when class is loaded");
    }
    static int a=10;
    static void m1(){
        System.out.println("static function");
    }
    static class A1{
        // Not useful
    }
}