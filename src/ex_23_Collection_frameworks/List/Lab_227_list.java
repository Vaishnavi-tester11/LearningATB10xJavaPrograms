package ex_23_Collection_frameworks.List;
import java.util.ArrayList;
import java.util.List;

public class Lab_227_list {
    public static void main(String[] args) {

        List fruits=List.of("orange","1",3,"Banana");
//        fruits.add("Hello");
//        fruits.remove("orange");  // List is an interface , add & remove methods not implemented completely
        // we will use ArrayList class, ArrayList will implements List, here all fns are implemented completely
// Order should be maintained in ArrayList
        ArrayList al=new ArrayList();
        al.add("HI");
        al.add(1);
        al.add(3.14);
        al.add("HI");
        al.add(null);
        System.out.println(al);
        System.out.println(al.size());


        List l=new ArrayList(); // dynamic dispatch
        l.add("123");
        l.add(23.45);
        System.out.println(l);

    }
}
