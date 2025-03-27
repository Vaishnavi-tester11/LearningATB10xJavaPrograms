package ex_16_OOPs_concepts_2.Accessmodifier.Police;

public class Cop {
    public int gun;
    String iCard;

    Cop(int gun){
        this.gun=gun;
    }

    protected void canIshoot(){
        System.out.println("Yes you can Shoot!!");
    }
}
