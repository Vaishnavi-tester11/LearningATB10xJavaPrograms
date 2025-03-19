package ex_12_Strings;

import java.util.Arrays;

public class Interview_Q2 {
    public static void main(String[] args) {

        String name= "Bindu is a Beautiful girl";

        String[] name_arr=name.split(" ");

        String small_string=name_arr[0];
        String large_string=name_arr[0];

        for(int i=0; i< name_arr.length ; i++){
            if(name_arr[i].length() < small_string.length()){
                small_string=name_arr[i];
            }
           if (name_arr[i].length() > large_string.length()) {
                large_string = name_arr[i];
            }
        }
        System.out.println(small_string);
       System.out.println("Smallest String in the given String: "+small_string);
        System.out.println("Biggest String in the given String : "+ large_string);

    }
}
