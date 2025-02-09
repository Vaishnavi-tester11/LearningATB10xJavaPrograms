package ex_09_for_loop;

public class Lab04_ood_even {
    public static void main(String[] args) {
        // find even numbers from 1 to 50
        for (int i = 1; i <=50 ; i++) {
            if(i%2==0){
                System.out.println(" Even -> " + i);
            }
            else{
                System.out.println(" Odd -> " +i);
            }
        }
    }
}
