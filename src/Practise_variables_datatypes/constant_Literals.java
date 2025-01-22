package Practise_variables_datatypes;

public class constant_Literals {
    public static void main(String[] args) {
        float pi=3.14f;
        System.out.println(pi);

        pi=4.14f;
        System.out.println(pi);

        final float PI=3.14f;
        System.out.println(PI);

        // PI=3.14f;  because for final/constant reassigning is not possible

        final int a=10;
        final String  name="vaishu";
        final double x=999.99;
        final int AGE;
//        System.out.println(AGE); Default value of local Variable is not assigned by JVM.
//        we have to assign value to the Local Variables
        AGE=30;
        System.out.println(AGE);

    }
}
