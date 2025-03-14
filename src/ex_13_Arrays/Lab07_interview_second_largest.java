package ex_13_Arrays;

import java.util.Arrays;

public class Lab07_interview_second_largest {
    public static void main(String[] args) {
        int[] num={12,1,45,10};
        Arrays.sort(num); // use to sort the array

        System.out.println(num[num.length-2]);
    }
}
