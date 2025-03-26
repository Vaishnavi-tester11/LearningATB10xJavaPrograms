package ex_16_OOPs_concepts_2.Poly.Poly_Methodoverloading;

public class LabEx_MOloading {
    public static void main(String[] args) {
        MathOperations ms=new MathOperations();

        int rs1=ms.add(14,12);  // at compile  time ref ms act as differently
        System.out.println(rs1);

        int rs2=ms.add(12,12,20);
        System.out.println(rs2);


    }
}
