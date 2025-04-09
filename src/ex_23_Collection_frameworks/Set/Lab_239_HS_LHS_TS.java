package ex_23_Collection_frameworks.Set;

import java.sql.SQLOutput;
import java.util.*;

public class Lab_239_HS_LHS_TS {
    public static void main(String[] args) {
        Set hs =new HashSet();
        // Order is not maintained & no duplicates allowed
        hs.add("Apple");
        hs.add("Mango");
        hs.add("JackFruit");
        hs.add("WaterMelon");
        hs.add(null);
        hs.add(123);
        System.out.println(hs);

        System.out.println("------------------------------");
        // LinkedHashSet
        Set lhs=new LinkedHashSet();
        lhs.add("JackFruit");
        lhs.add("WaterMelon");
        lhs.add(null);
        lhs.add(123);
        lhs.add("Apple");
        lhs.add("Mango");

        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.size());

        System.out.println("____________________");

        // Tres Set
        Set ts=new TreeSet();
        // Black & REd Tree mechanism to store element
        // order will maintain, Natural sorting is done
        ts.add(2324);
        ts.add(1234);
        ts.add(9876);
        ts.add(5678);
        //ts.add(null);  // NullPointerException
        //ts.add("Ahaana");   // ClassCastException

        System.out.println(ts);

        System.out.println("-------For Each--------");

        for(Object o1:ts){
            System.out.println(o1);
        }
    }
}
