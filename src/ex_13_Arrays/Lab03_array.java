package ex_13_Arrays;

import java.util.Arrays;

public class Lab03_array {
    public static void main(String[] args) {
        int[] marks={51,100,91,87,90};
        // to iterate array we will use for loop
        int len=marks.length;
        for(int i=0; i<len; i++){
            System.out.println(marks[i]);  // 51, 100,91,87,90
        }

        // sorting using Arrays.sort(marks)

        Arrays.sort(marks);
        for(int i=0; i<len; i++){
            System.out.println(marks[i]); // 51,87,90,91,100
        }
    }
}
