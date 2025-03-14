package ex_13_Arrays;

public class Lab06_sumOfArray {
    public static void main(String[] args) {
        int[] arr={12,34,10,50};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }

        System.out.println("Sum of the array elements is "+sum);

        System.out.println("--------------");
        int s=0;

        // for each loop only works for arrays & collection frame work
        for(int n:arr){ // 12,34,10,50
            s=s+n;
        }
        System.out.println(s);



    }
}
