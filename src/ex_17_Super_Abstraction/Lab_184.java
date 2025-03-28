package ex_17_Super_Abstraction;

public class Lab_184 {
    public static void main(String[] args) {
        CAB t1=new CAB();
        t1.display();

    }

}

class XYZ{
    protected int my_gold=10;
}

class CAB extends XYZ{
    void display(){
        System.out.println(my_gold);
    }
}
