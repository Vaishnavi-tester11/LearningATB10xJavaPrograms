package Task_19_Jan;

public class task_19_CLI_MAX {
    public static void main(String[] args) {
        int n1= Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        System.out.printf("n1 = %d",n1);
        System.out.println();
        System.out.printf("n2 = %d ",n2);
        System.out.println();
        String max= n1>=n2 ? " n1 " : "n2";
        System.out.printf("Max is %s ",max);
    }
}
