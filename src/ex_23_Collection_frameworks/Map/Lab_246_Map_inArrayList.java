package ex_23_Collection_frameworks.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab_246_Map_inArrayList {
    public static void main(String[] args) {
        HashMap<String, String> s1=new HashMap();
        s1.put("name","Vaishu");
        s1.put("class","12th");
        s1.put("Roll","20");
        System.out.println(s1);

        HashMap<String, String> s2=new HashMap();
        s2.put("name","Raghu");
        s2.put("class","13th");
        s2.put("Roll","21");
        System.out.println(s2);

        List student=new ArrayList();
        student.add(s1);
        student.add(s2);
        System.out.println(student);
    }
}
