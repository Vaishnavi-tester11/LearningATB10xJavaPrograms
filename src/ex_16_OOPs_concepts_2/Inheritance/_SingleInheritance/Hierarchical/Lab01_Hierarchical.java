package ex_16_OOPs_concepts_2.Inheritance._SingleInheritance.Hierarchical;

public class Lab01_Hierarchical {

    public static void main(String[] args) {

        Son1 s1=new Son1();
        s1.h2();
        s1.home(); //father

        Son2 s2=new Son2();
        s2.l2();
        s2.home(); // father

        Ruha r1=new Ruha();
        r1.r1();
        r1.home(); // father

        ///    One parent to multiple child

    }

}
