package ex_13_Arrays;

public class Lab04_Max_Min_Array {
    public static void main(String[] args) {
        int[] array={25, 14, 56, 15, 36, 56, 77, 18,29, 49};
        // min, max
        int result=find_max(array);
        System.out.println("Maximum value of array is "+ result); //77

        int result2=find_min(array);
        System.out.println("Minimum value of array is "+result2); //14
    }

    static int find_max(int[] array){

        int max=array[0];

        for( int i=0; i<array.length ;i++){
            if(array[i] > max){
                max=array[i];
            }
        }
        return max;
    }

    static int find_min(int[] array){
        int min=array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
