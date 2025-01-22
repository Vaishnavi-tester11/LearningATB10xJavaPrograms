package Practise_variables_datatypes;

public class type_casting {
    public static void main(String[] args) {
        // type casting is converting the variable data type to another data type
        // Widening : converting lower type to higher type
        // Implicit -> Jvm will do automatically, explicitly: done by manually
        byte b1=100;
        int a1=b1; // Implicitly
        System.out.println(a1);
        int a2=(int)b1; // Explicitly we are doing
        System.out.println(a2);

        // Narrowing : converting higher type to lower type , we can loss the data

        double gst=3.16;
        int x=100;
        int x1=(int)gst; // explicitly
        System.out.println(x+x1);

    }
}
