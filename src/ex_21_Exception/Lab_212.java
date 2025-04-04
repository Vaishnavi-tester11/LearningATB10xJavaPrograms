package ex_21_Exception;

public class Lab_212 {
    public static void main(String[] args) {
        try {
            String s1=args[0];
            int a=Integer.parseInt(s1);
            int b=100/a;
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        // If we don't have any idea which exception will come
        // then Use Exception class
    }
}
