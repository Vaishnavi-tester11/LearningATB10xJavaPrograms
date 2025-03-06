package ex_12_Strings;

public class Diff_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        // we will String 90%
        // StringBuilder 5-7%
        // Thread local -> Multithreading

        StringBuffer name=new StringBuffer("Vamsi");
        name.append(" Reddy");
        System.out.println(name);
        name.reverse();
        System.out.println(name);
        name.reverse();
        System.out.println(name);


        StringBuilder sb=new StringBuilder(" Ahaana ");
        sb.append("Reddy");
        System.out.println();
        sb.reverse();
        System.out.println(sb);

        // this is the stringBuffer & StringBuilder example
    }
}
