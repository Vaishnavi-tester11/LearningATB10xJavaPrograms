package Task_19_Jan;

public class task_19_CLI {
    public static void main(String[] args) {
        String Name=args[0];
        int Age=Integer.parseInt(args[1]);
        float Salary=Float.parseFloat(args[2]);

        System.out.printf("The Name is %s ",Name);
        System.out.println();
        System.out.printf("Age is %d ",Age);
        System.out.println();
        System.out.printf("Salary is %f ",Salary);

    }
}
