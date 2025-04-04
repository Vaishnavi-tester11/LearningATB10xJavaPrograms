package ex_21_Exception;

public class Lab_216_ThrowEx {
    static void validate_age(int age){
        if(age<18){
            try {
                throw new Exception("Age can't be <18");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        validate_age(17);
    }
}
