package ex_17_Super_Abstraction;

public class Lab_186_AC {
    public static void main(String[] args) {
        WagonR c1=new WagonR();
        c1.Drive();

    }

}

abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
}

class WagonR extends Engine{
    @Override
    void startEngine() {
        System.out.println("Start");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop");
    }

    void Drive(){
        startEngine();
        System.out.println("I am driving");
        stopEngine();
    }
}