package ex_17_Super_Abstraction;

public class Lab_191 {
    public static void main(String[] args) {
        Reddy r1=new Reddy();
        r1.display();
    }
}

class Reddy implements Vaishu{

    @Override
    public void display() {
        System.out.println(a);
    }
}

interface Vaishu{
    int a=10;
    void display();
}
