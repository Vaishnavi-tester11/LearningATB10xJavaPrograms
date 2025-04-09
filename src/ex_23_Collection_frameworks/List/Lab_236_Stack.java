package ex_23_Collection_frameworks.List;

import java.util.Stack;

public class Lab_236_Stack {
    public static void main(String[] args) {
        // Stack LIFO(Last in firstOut)

        Stack s=new Stack();
        s.add("Vaishu");
        s.add("Vamsi");
        s.push("Reddy");
        s.push("Ahu");

        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());  // gives the last element
        System.out.println(s.pop());   // removes the last element
        System.out.println(s);
        System.out.println(s.contains("Vaishu"));
        s.add("Raghu");          // add fn coming from list
        s.push("Reddy");     // push fn coming from Stack class
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.get(s.size()-1));
        s.push("Vamsi");
        System.out.println(s);

        // collection  -> List -> Vector -> Stack
    }
}
