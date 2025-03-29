package ex_18_Static;

public class Lab_195_Static_real {
    public static void main(String[] args) {
        Automation t1=new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);
        Automation.driver="Firefox";
        System.out.println(Automation.driver);  // Static variables can change the values
    }
}

class Automation{
    static String driver="chrome";
}