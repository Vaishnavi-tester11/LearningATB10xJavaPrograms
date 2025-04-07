package ex_23_Collwction_frameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_231_ArrayList_95 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("bread");
        list.add("paneer");
        list.add("butter");
        list.add("curd");
        list.add("Milk");
        list.add("ghee");
        list.add(123);

        System.out.println(list.size());
        System.out.println(list.contains("Milk"));
        System.out.println(list.isEmpty());

        System.out.println(" -------------- ");
        for(int i=0;i <=list.size()-1;i++){
            System.out.println(list.get(i));
        }

        System.out.println(" ---- for each loop");
        for(Object o:list){
            System.out.println(o);
        }

        System.out.println("--- To print ArrayList Iterator--");

        //Iterator - Anchor -go one by one forward -> get access them
        // HasNext() -> true - if we have a next element
        // Next -> element
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
