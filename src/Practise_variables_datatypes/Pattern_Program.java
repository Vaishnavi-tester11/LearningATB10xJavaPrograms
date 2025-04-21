package Practise_variables_datatypes;

public class Pattern_Program {
    public static void main(String[] args) {
        int n=5;

      // 1. Right Angle Triangle pattern
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

      // 2.Left Angle Triangle Pattern

      for(int k=n ; k>=1; k--){
          for(int l=k; l>=1; l--){
              System.out.print("*");
          }
          System.out.println();
      }

      // 3.Pyramid pattern

        int rows=5;
        for(int x=1; x<=rows; x++) {
            for (int z = 1; z < rows - x; z++) {
                System.out.println(" ");

            }
            for (int y = 1; y <= 2 * x - 1; y++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
