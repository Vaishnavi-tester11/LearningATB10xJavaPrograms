package Practise_variables_datatypes;

public class Ternary2 {
    public static void main(String[] args) {

        // Giving grades to Marks
        int marks=45;

        String Grade= marks >=90 ? "A" : marks>=80 ? " B" : marks>=70 ? "C" : marks >=60 ? "D" : "F" ;
        System.out.println("Your Grade is "+Grade);
        System.out.printf("Your Grade is %s",Grade);
    }
}
