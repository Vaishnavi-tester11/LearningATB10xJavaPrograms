package Task_19_Jan;

public class task_19_Max {
    public static void main(String[] args) {
        int a=23,b=138,c=107;

        int res= a>=b ? (a>=c ? a : c) : (b>=c ? b : c);

        System.out.printf(" The largest number is %d",res);
    }
}
