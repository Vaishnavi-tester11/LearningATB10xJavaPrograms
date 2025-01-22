package ex_06_ternaryOperator;

public class LAB_02 {
    public static void main(String[] args) {
        int num =10;
        String result= (num%2==0) ? "Even" : "Odd" ;
        System.out.printf("%d is %s ",num,result);
    }
}
