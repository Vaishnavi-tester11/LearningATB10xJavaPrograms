package ex_16_OOPs_concepts_2.Poly.Poly_Methodoverloading;

import java.sql.SQLOutput;

public class task {
    public static void main(String[] args) {
        MathOperations ms=new MathOperations();
        Math op1=new Math(4,5);
        Math op2=new Math(10,20,30);
    }
}

class Math {
    Math(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    Math(int a, int b, int c){
        int res=a+b+c;
        System.out.println(res);
    }
}
