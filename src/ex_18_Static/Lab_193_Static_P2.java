package ex_18_Static;

public class Lab_193_Static_P2 {
    public static void main(String[] args) {
        ATB s1=new ATB(987654321,"Akash");
        ATB s2=new ATB(987654534,"Akhil");
        s1.display();;
        System.out.println(ATB.course_name);
    }
}

class ATB{
    static String course_name="ATB";
    int phone_np;
    String name;

    public ATB(int phone_np,String nam){
        this.phone_np=phone_np;
        this.name=nam;
    }

    void display(){
        System.out.println(this.phone_np +this.name +course_name);
    }
}