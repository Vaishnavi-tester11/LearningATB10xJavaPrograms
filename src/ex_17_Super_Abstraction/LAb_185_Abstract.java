package ex_17_Super_Abstraction;

public class LAb_185_Abstract {
    public static void main(String[] args) {
        Son s1=new Son();
        s1.loan50k();
        s1.loan25k();

    }
}


// abstract class ->

abstract class Father{
    abstract void loan50k();  // incompleted methods
    void loan25k(){
        System.out.println("Given 20k");
    }

}

class Son extends Father{

    @Override
    void loan50k() {
        System.out.println("Son will pay the 50k Loan");
    }
}
