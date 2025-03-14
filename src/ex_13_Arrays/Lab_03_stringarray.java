package ex_13_Arrays;

public class Lab_03_stringarray {
    public static void main(String[] args) {

        // how to define String Array

        String[] names={"vaishu","Raghu","Tharun"};

        String[] names2 = new String[4]; // fixed size
        names2[0]="Ammu";
        names2[1]="Ahaana" ;
        names2[2]=" Bindu " ;

        int len=names2.length;

        for (int i=0; i<len ; i++){
            System.out.println(names2[i]);
        }

        // defining boolean array

        boolean[] is_female_data=new boolean[2];
        is_female_data[0]= true;
        is_female_data[1] = false;

    }
}
