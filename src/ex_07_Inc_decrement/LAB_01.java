package ex_07_Inc_decrement;

public class LAB_01 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);

        // A + B
        // A-> a++ -> Exp ->10,  a=11
        // B -> Exp -> 11,  a =11
        // A+ B= 10+11
        a=10;
       int res= a++ + ++a;
        // line  |   Exp | a
        // 12  |   NA    | 10
        // 13  |  Exp1 -> a=10 | 11
//                  Exp2 -> 12 | 12
        // Exp1 + Exp2 = 10+12 =22
        System.out.println(res);

    }
}
