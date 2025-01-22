package Practise_variables_datatypes;

public class Tacking_input_args {
    public static void main(String[] args) {

        int a=Integer.parseInt(args[1]);

        System.out.printf("%s %s %s ",args[0],args[1],args[2]);
        System.out.println( a>=25 ? "Allowed to go to Goa" : "NOt Allowed");





    }
}
