package ex_12_Strings;

public class Lab02_concat {
    public static void main(String[] args) {
        String s1="Hello";
        //s1.concat("world"); // we are not assining new value to identifier
        s1= s1.concat("world");
        System.out.println(s1);
    }
}
