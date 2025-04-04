package ex_21_Exception;

public class Lab_207 {
    public static void main(String[] args) {

        System.out.println("Start!!");
        String s1=null;
        try {
            s1.trim();
        }catch(Exception e){
          e.printStackTrace();
        }
        System.out.println("End !!");
    }
}
