package Practise_variables_datatypes;

public class tacking_input_user_ex2 {
    public static void main(String[] args) {
        // taking input using Argument console

        int A=Integer.parseInt(args[0]);
        int B=Integer.parseInt(args[1]);

        System.out.printf("A = %d ,B =%d ",A,B);
        System.out.println();
        System.out.printf("MAX is %d", A >= B ? A: B);

    }
}
