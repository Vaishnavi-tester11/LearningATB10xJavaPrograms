package Practise_variables_datatypes;

import org.w3c.dom.ls.LSOutput;

public class Increment {
    public static void main(String[] args) {

        // prefix
        int a=12;
        int res= ++a;
        System.out.println(a);
        System.out.println(res);
        System.out.println( a++ + a); // 13 + 14 = 27
        System.out.println("a="+a);
// line no | a | Exp
//      9  | 12 | NA
//      10 | 13  |13
//       11 | 14 | 13+14







        // postfix
        int x=78;
        int res1=x++;
        System.out.println(x);
        System.out.println(res1);

    }

}
