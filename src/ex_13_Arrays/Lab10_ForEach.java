package ex_13_Arrays;

public class Lab10_ForEach {
    public static void main(String[] args) {
        int[] a=new int[3];
        a[0]=90;
        a[1]=91;
        a[2]=92;

        for(int i:a){
            System.out.println(i);
        }

        String[] names={" Ammu"," Bindu "," Ahaana"," Chintu"};
        for(String name: names){
            System.out.println(name);

        }
    }
}
