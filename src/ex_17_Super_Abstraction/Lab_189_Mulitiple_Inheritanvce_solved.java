package ex_17_Super_Abstraction;

public class Lab_189_Mulitiple_Inheritanvce_solved {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.money();
    }

}
class Child implements Mother1,Father1{

    @Override
    public void f1() {

    }

    @Override
    public void money() {
        System.out.println(" only one money");
    }

    @Override
    public void m1() {

    }
}

interface Mother1{
    void money();
    void m1();
}
interface  Father1{
    void money();
    void f1();

    default void ff(){
        System.out.println("This is only allowed!!");
    }
}