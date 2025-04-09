package ex_23_Collection_frameworks.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_233_ArrayList_collections {
    public static void main(String[] args) {
        List marks=new ArrayList();
        marks.add(90);
        marks.add(89);
        marks.add(45);
        marks.add(100);
        marks.add(95);
        System.out.println(marks);

        // collection -> interface, which have incomplete methods
        // collections -> is class, it contains complete methods which list, set, Que may required

        // sorting using collections
       Collections.sort(marks);
        System.out.println(marks);

        // reverse sorting
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
