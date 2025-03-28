package ex_17_Super_Abstraction;

public class Lab_187_Interfaces_P1 {

    public static void main(String[] args) {
        Car2 c2=new Car2();
        c2.drive();
    }
}

class Car2 implements Engine1,Break{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stop Engine");
    }
}



interface Engine1{
    void startEngine();
    void stopEngine();
}

interface Break{
    void applyBreak();
}
