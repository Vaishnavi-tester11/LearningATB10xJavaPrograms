package ex_08_If_else_conditions;

public class Lab10_Lamda {
    public static void main(String[] args) {
        int itemcode=001;

        switch(itemcode){
            case 001-> System.out.println('A');  // this is called lambda exp break include in this( ->)
            case 002 -> System.out.println('B');
            case 003 -> System.out.println('C');
            default -> System.out.println("None");
        }

    }
}
