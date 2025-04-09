package ex_23_Collection_frameworks.Set;

import java.util.HashSet;
import java.util.*;

public class Lab_238_Set {
    public static void main(String[] args) {
        Set hs=new HashSet();
        Set lhs=new LinkedHashSet();
        Set ts=new TreeSet();

        hs.add("Vaishu");
        hs.add("Raghu");
        hs.add("Aahu");
        hs.add("Daamu");
        hs.add("Vaishu");
        hs.add("vaishu");
        hs.add("Aahu");
        System.out.println(hs);

    }
}
