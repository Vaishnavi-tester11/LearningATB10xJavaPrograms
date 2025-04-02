package ex_16_OOPs_concepts_2.Inheritance._SingleInheritance._SingleInheritance_Realexample;

public class Inheritance {
    public static void main(String[] args) {
        Son s1=new Son();
        s1.bhk2();
        s1.bhk3();
    }
}
class Father{
    void bhk2(){
        System.out.println("Father - 2BHK ");
    }
}

class Son extends Father{
    void bhk3(){
        System.out.println("Son - 3BHK ");
    }
}
