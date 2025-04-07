package ex_23_Collwction_frameworks;

import java.util.Vector;
import java.util.List;

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
    }
    }

