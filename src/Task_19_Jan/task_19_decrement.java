package Task_19_Jan;

public class task_19_decrement {
    public static void main(String[] args) {
        int a= 20;
        int res= --a + a++ + a--;
        // A -> --a =19, a=19
        // + B -> a++ =19, a=20
        // + C -> a-- =20, a=19
        // A + B + C = 19 + 19 +20 => 58
        System.out.printf(" Result is %d ",res);


    }
}
