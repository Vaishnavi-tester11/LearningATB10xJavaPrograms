package ex_16_OOPs_concepts_2.Poly.OverRiding;

public class Lab175 {
    public static void main(String[] args) {
        Son s=new Son();
        s.home();

        Father f=new Father();
        f.home();

        Father f2=new Son(); // dynamic dispatch
        f2.home();   //           Method Overriding
    }
}
