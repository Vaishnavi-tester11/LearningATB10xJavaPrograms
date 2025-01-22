package Practise_variables_datatypes;

public class Tenary_operator {
    public static void main(String[] args) {
        int x1=10;
        int x2=50;

        int res= x1<x2 ? x2 :x1;
        System.out.println(res);

        int x3=12;
        System.out.println(x3 > 18 ? "allowed to vote" : "Not Allowed to vote");

        int Max=( (x1>x2) ? x1 : (x2>x3) ? x2 : x3);
        System.out.println(Max);

        String res1=((x1>x2) ? "x1" : (x2>x3) ? "x2" : "x3");
        System.out.println(res1);
    }
}
