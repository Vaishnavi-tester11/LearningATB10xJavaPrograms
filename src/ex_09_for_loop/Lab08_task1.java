package ex_09_for_loop;

public class Lab08_task1 {
    public static void main(String[] args){
        int count=0;
        int count1=0;
        int count2=0;

        for(int i=1; i<=100; i++){

            if(( i%3==0) && (i%5==0)){
                System.out.println("FizzBuzz");
                count=count+1;
            }
            else if(i % 5==0){
                System.out.println("Buzz");
                count1=count1+1;
            }
            else if(i%3==0){
                System.out.println("Fizz");
                count2=count2+1;
            }
            else{
                System.out.println(i);
            }
        }

        System.out.println("The total numbers divided by 3 & 5 are between 1 to 100  "+count);
        System.out.println("The total numbers divided by 5 from 1 to 100 are "+count1);
        System.out.println("The total numbers divided by 3 from 1 to 100 is "+count2);
    }
}
