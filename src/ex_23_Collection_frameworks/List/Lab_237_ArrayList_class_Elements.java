package ex_23_Collection_frameworks.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_237_ArrayList_class_Elements {
    public static void main(String[] args) {
        Student s1=new Student("Ahu","1");
        Student s2=new Student("Lulu","2");
        Student s3=new Student("Pannu","3");

        List<Student> myStudents=new ArrayList(); // Inplace of AL, we can use LL,Vector,Stack
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);
        s1.details();
        s2.details();
        s3.details();


    }
}
