package ex_11_Functions;

public class Lab02_userdefined {
    public static void main(String[] args){ // called by JVM
        // without parameters & without return type
        main();
        greet();
    }
    // declaration/ definition
    static void main(){
        System.out.println("Hi, I am from another main");
    }
    static void greet(){
        System.out.println("Hi, How are you ?");
    }
}
