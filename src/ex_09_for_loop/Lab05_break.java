package ex_09_for_loop;

public class Lab05_break {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if(i==5){
                break; // break statement will break the loop and come out of the loop
            }
            System.out.println(i);
        }
    }
}
