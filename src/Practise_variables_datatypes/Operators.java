package Practise_variables_datatypes;

public class Operators {
    public static void main(String[] args) {
        // unary, binary, trinary
        int a=10;
        int b=20;
        System.out.println(a+b); // + -> mathmatical operation
        // relational operator <,>,>=,<=,==,!=
        boolean c=(a < b);
        System.out.println(c);
        String name1="Vaishu";
        String name2="Raghu";
        System.out.println(name1+name2); // + is doing concatination
        // + is behaving differently with datatypes
        // + operator overloading
        System.out.println(name1+name2+a+b); // if first operand is string + will act as conactination
        System.out.println(a+b+name1+name2); 
        System.out.println(name1+name2+(a+b));

    }
}
