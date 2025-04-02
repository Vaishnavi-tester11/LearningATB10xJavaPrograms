package ex_20_WrapperClass;

public class Lab_202_Wrapper {
    public static void main(String[] args) {
        int a=10;
        Integer b=a; // Boxing int -> Integer - JVM -> AutoBoxing (small to big)

        // Now a will have attributes & Behaviour

        Integer a2=24;
        int v=a2;  // unboxing -> big to small
        System.out.println(v);


    }
}
