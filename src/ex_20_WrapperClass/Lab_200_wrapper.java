package ex_20_WrapperClass;

public class Lab_200_wrapper {
    public static void main(String[] args) {
        int a=10; // primitive datatype

        // we will avoid primitive datatype like char, short, int float,double
        // we will use wrapper classes

        Integer a1=10;
        System.out.println(a1.intValue());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // String, Integer,Long,Float,Boolean are the wrapper class
        // if we use wrapper class we will extra attributes & methods
    }
}
