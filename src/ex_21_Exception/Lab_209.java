package ex_21_Exception;

public class Lab_209 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            //int c=10/b;
            String s1=null;
            s1.trim();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
}
