package ex_13_Arrays;

public class Lab_02_array {
    public static void main(String[] args){
        int[] marks={90,78,56,45}; // 1st way to create array

        int[] marks2= new int[5]; // fixed size

        System.out.println(marks2.length);

        marks2[0]=23;
        marks2[1]=89;
        marks2[2]=90;
        marks2[3]=67;

        int l=marks2.length;

        for(int i=0;i<l;i++){

            System.out.println(marks2[i]);
        }

    }
}
