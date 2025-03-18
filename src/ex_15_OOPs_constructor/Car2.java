package ex_15_OOPs_constructor;

public class Car2 {
    // parameterize constructor

    String model;
    int year;

    Car2(){
        System.out.println("DC");
        model="XXX";
        year=1993;
    }

    Car2(String model_name,int year_created){
        this.model=model_name;
        this.year=year_created;
    }
}
