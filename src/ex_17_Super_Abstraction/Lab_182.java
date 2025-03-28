package ex_17_Super_Abstraction;

public class Lab_182 {
    public static void main(String[] args) {
        Car c=new Car(10);
        c.display();

    }
}

class Car extends Vehicle{
    private int maxSpeed = 280 ;

    // we can call only constructor of parent using son constructor

    Car(){
        super(100);  // calling my parent

    }
    Car(int a){
        System.out.println(" PC Car");
    }

    @Override
    void display(){
        System.out.println(" Override - Car ");
        System.out.println(super.maxSpeed); // father clas speed 100
        System.out.println(this.maxSpeed);
    }


}

class Vehicle{
    public int maxSpeed=100;




    Vehicle(){
        System.out.println("Default Const");
    }

    Vehicle(int a){
        System.out.println("Param Const");
    }

    void message(){
        System.out.println("No return, NO Argument");
    }

    void message(int a){
        System.out.println("PC - argument");
    }

    void display(){
        System.out.println("Vehicle Parent");
    }
}