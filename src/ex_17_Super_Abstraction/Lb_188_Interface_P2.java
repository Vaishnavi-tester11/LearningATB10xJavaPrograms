package ex_17_Super_Abstraction;

public class Lb_188_Interface_P2 {
    public static void main(String[] args) {
        P p =new P();
        p.icm1();
        p.icm2();
        p.icm3();

    }
}

class P implements I1,I2{

    @Override
    public void icm1() {
        System.out.println("ICM1 complete");
    }

    @Override
    public void icm2() {
        System.out.println("ICM2 complete");
    }

    @Override
    public void icm3() {
        System.out.println("ICM3 complete");
    }
}

interface I1{
    void icm1();
    void icm2();
}

interface I2{
    void icm3();
}

