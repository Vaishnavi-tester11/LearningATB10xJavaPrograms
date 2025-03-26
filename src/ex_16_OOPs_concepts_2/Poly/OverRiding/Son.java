package ex_16_OOPs_concepts_2.Poly.OverRiding;

public class Son extends Father {
    @Override
    void home(){
        System.out.println("Son - 3BHK");
    }

    // Same name function present in Son class and Father class, Where we can Override the function in father
}
