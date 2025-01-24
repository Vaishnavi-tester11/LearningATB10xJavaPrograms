package Task_19_Jan;

public class task_19_Grade_calculator {
    public static void main(String[] args) {
        int Marks= 75;

        char res= Marks >= 90 ? 'A' :( Marks >=80 ? 'B' : (Marks >=70 ? 'C' :(Marks >=60 ? 'D': 'F')));
        System.out.printf(" Grade is %c",res);
    }
}
