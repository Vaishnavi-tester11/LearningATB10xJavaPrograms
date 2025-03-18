package ex_15_OOPs_constructor;

public class Labo2_con2 {
    public static void main(String[] args) {
        A a1=new A();

        System.out.println(a1);

    }
}
class A{

    A(){
        System.out.println("I want o read a csv file");
        System.out.println(" Open the page before loading Scripts");
        System.out.println(" we can do anything when Object is creating");
    }
}