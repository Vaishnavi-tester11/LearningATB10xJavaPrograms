package Task_19_Jan;

public class task_19_INCREMENT {
    public static void main(String[] args) {
        int a=10;
        int res= ++a + a++ + a++;
        // Line    | exp        | a
        // 5        | NA        |10
        //  A -> ++a = 11 , a=11
        //  +  B -> a++ =11, a=12
        //  +  C -> a++ =12, a= 13
        // A + B+ C = 11 + 11 + 12 => 34
        // a = 13
        System.out.printf("Result is %d ",res);
        System.out.println();
        System.out.printf("a value is %d",a);
    }

}
