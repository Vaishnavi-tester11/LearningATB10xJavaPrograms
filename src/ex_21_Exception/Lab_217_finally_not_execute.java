package ex_21_Exception;

public class Lab_217_finally_not_execute {
    public static void main(String[] args) {

        try {
            int a=10/10;  // If it's run without any exception, program jumped to exit code,
                          // if any exception will come finally will be executed
            System.exit(0);   // can only stop the execution of finally block.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Hello, I am executed !!");
        }
    }
}
