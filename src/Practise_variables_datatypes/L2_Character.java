package Practise_variables_datatypes;

public class L2_Character {
    public static void main(String[] args) {
        char name='A'; // A-Z, a-z, @!#$%^&*()
        System.out.println(name);
        char name2='@';
        System.out.println(name2);
//        char x1="a"; when we mention value in the double quote sys understand it's a String

        String name3="Vaishnavi"; // String is bunch of characters , always mention in double quote
        System.out.println(name3);

        char c1='A'; // ascii value of A=65
        char c2='B'; // ascii value of B=66
        // concatination of cha -> int caliculation
        System.out.println(c1+c2); // 65+66=131
        System.out.printf("My intitial is %c",c1);
    }
}
