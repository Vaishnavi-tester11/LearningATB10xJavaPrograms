package Task_9th_Feb;

import java.util.Scanner;

public class Second_Min_OfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size=sc.nextInt();
        int[] arr=new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter the value ");
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int j=0; j<size-1; j++){
            for(int k=0; k<size-1-j; k++){
                if(arr[k]>arr[k+1]){
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }

        for(int x=0; x<size; x++){
            System.out.println(arr[x]);
        }

        System.out.println("Second smallest value in the array is "+arr[1]);
    }
}
