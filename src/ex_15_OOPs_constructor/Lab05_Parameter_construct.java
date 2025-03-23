package ex_15_OOPs_constructor;

public class Lab05_Parameter_construct {
    public static void main(String[] args) {
        mobile sc=new mobile();
        mobile iphone=new mobile("Iphone 16","2025");
        mobile samsung=new mobile("Samsung ultra AI","2025");
        System.out.println(sc.model);
        System.out.println(sc.year);
        System.out.println(" ----------------  ");
        System.out.println(iphone.model);
        System.out.println(iphone.year);
        System.out.println("------------------");
        System.out.println(samsung.year);
        System.out.println(samsung.model);

        samsung.display();
    }
}

class mobile{
    String model;
    String year;

    mobile(){
         model="Oppo";
         year="2024";

    }

    mobile(String model_name,String model_year){
        this.model=model_name;
        this.year=model_year;

    }

    void display(){
        System.out.println(this.model+" - " +this.year);
    }

}
