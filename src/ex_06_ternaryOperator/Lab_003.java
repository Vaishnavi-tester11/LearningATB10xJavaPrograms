package ex_06_ternaryOperator;

public class Lab_003 {
    public static void main(String[] args) {
        int n1=100,n2=34,n3=101;
        int res= (n1>=n2) ? ((n1 >= n3) ? n1 : n3 ):(n2 >= n3) ? n2 : n3 ;
        System.out.printf("the max number is %d",res);
    }
}
