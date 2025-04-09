package ex_23_Collection_frameworks.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab_230_Vector {
    public static void main(String[] args) {
        Vector list =new Vector();
        list.add("Vaishu");
        list.add("Reddy");
        list.add(1947);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Vaishu"));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf("Reddy"));
        System.out.println(list.lastIndexOf(1947));


        Iterator iterator=list.iterator();

        System.out.println("-----iterate the elements using iterator");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ---- iterate the elements using Enumeration");

        Enumeration enumeration = list.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
    }

