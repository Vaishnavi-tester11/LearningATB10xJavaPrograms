package ex_21_Exception;

public class Lab_210_try_catch_final {
    public static void main(String[] args) {
        int a=1;
        int c=0;

        try{
            c=10/0 ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I will be always executed");
        }

    }
}
