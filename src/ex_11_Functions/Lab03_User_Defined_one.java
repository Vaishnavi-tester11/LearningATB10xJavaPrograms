package ex_11_Functions;

import java.sql.SQLOutput;

public class Lab03_User_Defined_one {
        public static void main(String[] args){

            // 1. No arguments & no return
           // greet();

            // 2. No arguments but return type
            String s=greet_with_return();
            //System.out.println(s);

            int age_to_vote=age_to_vote();
            //System.out.println(age_to_vote);

            // 3. with parameter & no return type
//            greet_with_name("Vaishnavi");
//            greet_with_name("Raghu");
//            greet_with_name("Raghavaishu");

//            greet_with_fullname("Vaishnavi","Guvvala");
//            greet_with_fullname("Raghu","Alle");
//            greet_with_fullname("Bindu","Ahaana");

            greet_with_details("Vaishu",31,35000);
            greet_with_details("Raghu",38,50000);
            greet_with_details("Vaishu2",36,85000);

        }

    static void greet(){
        System.out.println("Heloooo");
    }

    static String greet_with_return(){
        return "Hi, Mam What are you doing" ;
    }

    static int age_to_vote(){
            return 18;
    }

    // 3. with parameter & no return type (90% we will use this)

    static void greet_with_name(String name){
        System.out.println("Hi your name is "+name);
    }

    static void greet_with_fullname(String first_name, String last_name){
        System.out.println("Hi your fullname is "+ first_name + last_name);
    }

    static void greet_with_details(String name,int age,float salary){
        System.out.printf("Your name is %s \n your age is %d \n your salary is %f ",name,age,salary);
    }

    // 4. with parameter & with return type


}








