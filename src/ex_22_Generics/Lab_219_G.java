package ex_22_Generics;

public class Lab_219_G {
    public static void main(String[] args) {
        temp(10,23);
        temp("hello","HI");
        temp(false,true);
        temp("pramod",123); // mixture of data types we can take

    }

    // generic fn T -> cab be any data type

    public static <T> T temp(T a,T b){
        System.out.println(a);
        System.out.println(b);

        return null;
    }
}

