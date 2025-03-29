package ex_19_Enum;

public class Lab_197_Enum_P2 {
    public static void main(String[] args) {
        System.out.println(URL.google);
        if(URL.google.equals("google")){
            System.out.println("I want to do somethings");
        }
    }

}

enum URL{
    google, vwo, katalon
}
