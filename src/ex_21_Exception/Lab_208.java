package ex_21_Exception;

public class Lab_208 {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        try{
            b=10/a;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
