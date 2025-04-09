package ex_23_Collection_frameworks.Map;

import java.util.*;

public class Lab_242_Map {
    public static void main(String[] args) {
        Map m1= new HashMap();
        // Map key,value
        m1.put("name","Vaishu");
        m1.put("rollno",1);
        m1.put("phone_no",987654321);

        System.out.println(m1);

        //Order will not maintained in case of HashMap

        System.out.println("----------------------------");

        Map m2= new LinkedHashMap();
        // Map key,value
        m2.put("name","Vaishu");
        m2.put("rollno",1);
        m2.put("phone_no",987654321);

        System.out.println(m2);

        // LinkedHashMap -> Order will Maintained

        System.out.println("----------------------------------");

        Map m3= new TreeMap();
        // Map key,value
        m3.put("name","Vaishu");
        m3.put("rollno",1);
        m3.put("phone_no",987654321);

        System.out.println(m3);
        // TreeMap -> Natural Sorting bases on Key


    }
}
