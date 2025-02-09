package ex_09_for_loop;

public class Lab07_evennumbers {
    public static void main(String[] args) {
        for(int i=0 ; i<=50 ; i++){
            if(i%2==0){
                System.out.println(" Even -> "+i);
                continue;
            }
            System.out.println(i);
        }
    }
}
