package ex_14_OOPs;

public class Cats {
    public static void main(String[] args) {

        Cat c1=new Cat();
        Cat c2;
        new Cat();

        c1.running();
        //c2.running(); // NullpointerException  bcz we are not creating Object here

    }
}

class Cat{
    String name;

    void running(){
        System.out.println("Running");
    }
}