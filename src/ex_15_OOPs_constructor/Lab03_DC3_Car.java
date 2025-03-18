package ex_15_OOPs_constructor;

public class Lab03_DC3_Car {
    public static void main(String[] args) {

        Car tesla=new Car();
        tesla.name = "Honda City";
        tesla.year=2016;
        System.out.println(tesla.name);
        System.out.println(tesla.year);

        System.out.println(" -------- ");

        Car nano=new Car();
        nano.name=" Tata Nano";
        System.out.println(nano.name);
    }
}

