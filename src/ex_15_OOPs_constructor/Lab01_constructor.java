package ex_15_OOPs_constructor;

public class Lab01_constructor {
    public static void main(String[] args) {

        Baby sc=new Baby();
        new Baby(); // this will call both default constructor & Instace initilizationblock
        new Baby();
    }
}

class Baby{

    String name;

    Baby(){  // default constructor
        System.out.println(" I am called, Obj is created");
    }

    // Instace initilizationblock
    {
        System.out.println(" I am also called when class is loaded");
    }

}
