package ex_23_Collection_frameworks.Map;

import java.util.*;

public class Lab_243_Map2 {
    public static void main(String[] args) {
        Map <String,Integer> m1=new HashMap();
        m1.put("id",1);
        m1.put("id",2);
        m1.put("id2",2);
        m1.put("id3",23);
        m1.put("id4",34);
        m1.put(null,102);
        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey("id4"));
        System.out.println(m1.containsValue(102));
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.containsKey("id3"));
        System.out.println(m1.get("id2"));

    }
}
