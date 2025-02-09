package ex_08_If_else_conditions;
import java.util.Scanner;

public class Lab07_HackerRank2 {
    public static void main(String[] args) {
        // 1. i/p -> int, Scanner class
        //    o/p -> String
        // 2. Rough logic
        // 3. Write code
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Side1");
        int s1=sc.nextInt();
        System.out.println("Enter the Side 2");
        int s2=sc.nextInt();
        System.out.println("Enter the Side3");
        int s3=sc.nextInt();
        // need to check three inputs whether they are integers or not using sc.hasNextInt()
        if ((s1<=0) || (s2<=0) || (s3<=0)){
            System.out.println("Invalid input: please enter the positive lengths");
        } else if ((s1 + s2 <= s3) || (s2 + s3 <= s1) || (s1 + s3 <= s2)) {
            System.out.println("Invalid input: The given sides do not form a valid triangle.");
        }
        else {
            if ((s1 == s2) && (s2 == s3) && (s3 == s1)) {
                System.out.println("Equilateral");
            } else if ((s1 == s2) || (s2 == s3) || (s1 == s3)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

        sc.close();

    }
}
