package Task_9th_Feb;

public class Sort_the_array {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        int len=numbers.length;

        int temp=0;

        for(int i=0; i<len-1; i++){
            for(int j=0; j<len-1-i; j++){
                if(numbers[j] > numbers[j+1]){
                    temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }


            }
        for(int z:numbers){
            System.out.println(z);
        }

    }
}
