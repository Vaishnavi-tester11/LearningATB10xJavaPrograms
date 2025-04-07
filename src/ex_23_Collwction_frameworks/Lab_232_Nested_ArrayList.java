package ex_23_Collwction_frameworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_232_Nested_ArrayList {
    public static void main(String[] args) {
//       List<String> l=new ArrayList();
//       l.add("Pramod");
//       l.add(123);

        List<String> fruits=new ArrayList();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("apple");
        fruits.add("cherry");
        System.out.println(fruits);

        List<String> fruits2=new ArrayList();
        fruits2.add("Mosambi");
        fruits2.add("chicco");
        fruits2.add("custard apple");
        System.out.println(fruits2);

        List<String> veg=new ArrayList();
        veg.add("tomato");
        veg.add("potatao");
        veg.add("Onion");
        System.out.println(veg);

        System.out.println("--Nested List----");

        List all_items=new ArrayList();
        all_items.add(fruits);
        all_items.add(fruits2);
        all_items.add(veg);

        System.out.println(all_items);
        System.out.println(all_items.get(0));
        System.out.println(all_items.getLast());

    }
}
