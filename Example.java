
package example;
public class Example {
   public static void main(String args[]) {
      int n = 3;
     int a[][]={{1,3,4},{2,4,3},{3,4,5}}; 
     int b[][]={{1,3,4},{2,4,3},{1,2,4}};
      int[][] c = new int[n][n];
      System.out.println("Matrix A:");
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(a[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println("Matrix B:");
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(b[i][j] + " ");
         }
         System.out.println();
      }
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++){
            for (int k = 0; k < n; k++) {
               c[i][j] = c[i][j] + a[i][k] * b[k][j];
            }
         }
      }
      System.out.println("The product of two matrices is:");
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(c[i][j] + " ");
         }
         System.out.println();
      }
   }
}