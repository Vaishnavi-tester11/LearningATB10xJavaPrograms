package ex_23_Collection_frameworks.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab_247_HashTable {
    public static void main(String[] args) {
        // Map K, V null values doesn't allows in HashTable

        //Hashtable - synchronized, slow and Legacy Class - THreas safe
        // T1, T2 - they will use on by one

        Hashtable<Integer,String> ht1=new Hashtable();
        ht1.put(1,"add");
        ht1.put(2,"two");
        ht1.put(3,"three");
       // ht1.put(null,"23");
        //ht1.put(5,null)
        System.out.println(ht1);


        Enumeration<Integer> e= ht1.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
