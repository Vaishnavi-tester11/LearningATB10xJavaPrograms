package ex_16_OOPs_concepts_2.Inheritance._SingleInheritance.multilevel;

public class Lab01_Multilevel {
    public static void main(String[] args) {
        Son s=new Son();
        Father f=new Father();
        GrandFather gf=new GrandFather();

        s.home(); // if son also have home, son's home will call,

        // priority Son -> Father -> GrandFather  check methods from low to high

        // Son s1=new GrandFather();
        // Son s1=new Father();

        // Polymorphism

        GrandFather g1=new Son();
        GrandFather g2= new Father();
        Father f2=new Son();

        // bcz of inheritance it is possible


    }
}
