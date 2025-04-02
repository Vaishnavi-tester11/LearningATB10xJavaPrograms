package ex_20_WrapperClass;

public class Lab_203_Wrapper_conversion {
    public static void main(String[] args) {
        String num="10";

        //String -> wrapper conversion
        Integer a=Integer.parseInt(num);
        System.out.println("a = "+a);

        //String to primitive
        int a2=Integer.parseInt(num);
        System.out.println("a2 = "+a2);

        Integer a3=Integer.valueOf("20");
        System.out.println("a3 = "+a3);

        int a4=Integer.valueOf("30");
        System.out.println("a4 = "+a4);

        // By using parseInt & valueof functions we can conver Sting to Integer
    }
}
