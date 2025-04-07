package ex_23_Collwction_frameworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_229_arrayList {
    public static void main(String[] args) {
        List mylist=new ArrayList(5);
        List mylist0=new ArrayList(); // default it will take

        List list=new LinkedList(); // Doubly Linked List
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
