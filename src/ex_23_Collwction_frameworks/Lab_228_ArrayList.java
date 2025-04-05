package ex_23_Collwction_frameworks;

import java.util.ArrayList;
import java.util.List;
public class Lab_228_ArrayList {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
    }
}
