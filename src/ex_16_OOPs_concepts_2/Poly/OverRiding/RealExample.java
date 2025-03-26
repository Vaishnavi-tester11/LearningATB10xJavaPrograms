package ex_16_OOPs_concepts_2.Poly.OverRiding;

public class RealExample {
    public static void main(String[] args) {
        TC t1=new TC();
        t1.openBrowser();

        TC2 t2=new TC2();
        t2.openBrowser();
    }
}

class CommonToAllTC{

    void openBrowser() {
        System.out.println("Open the browser in 5 sec");
    }

}

class TC extends CommonToAllTC{
    void startTC(){
        openBrowser();
    }
}

class TC2 extends CommonToAllTC{

        @Override  // it will be overriding the parent function, when ever it needed
        void openBrowser(){
            System.out.println("Open the browser in 2 sec");
        }
}


