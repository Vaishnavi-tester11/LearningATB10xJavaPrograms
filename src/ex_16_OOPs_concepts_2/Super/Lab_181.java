package ex_16_OOPs_concepts_2.Super;

public class Lab_181 {
    public static void main(String[] args) {
        Son s1=new Son();
        s1.t1();
    }



}
class Father{

    Father(){
        System.out.println("DC Father");
    }

    int gold=10;
    void home(){
        System.out.println("Home Father");
    }
}

class Son extends Father{

    Son(){
        super();
    }

    void t1(){
        super.home();// call parent class functios & variables

        System.out.println(super.gold);
    }
}