package ex_22_Generics;

public class Lab_218_Generics {
    public static void main(String[] args) {
        Integer res=temp_sum(10,20);
        String res1=temp_sum("hello","world");
        System.out.println(res);
        System.out.println(res1);

    }
    static Integer temp_sum(Integer a, Integer b){
        return a+b;
    }
    static String temp_sum(String a,String b){
        return a+b;
    }
}
