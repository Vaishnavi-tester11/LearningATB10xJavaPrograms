package ex_09_for_loop;

public class Lab06_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            if(i==10){
                continue;
            }
            System.out.println(i);
        }
    }
}
