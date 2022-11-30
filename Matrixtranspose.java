import java.util.*;
class Matrixtranspose
{
   public static void main(String args[])
   {
      int i,j;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the order of the matrix");
      int n = sc.nextInt();
      int m = sc.nextInt();
      int mat[][] = new int[n][m];
      System.out.println("Enter the elements of the matrix");
      for (i=0;i<m;i++)
         for(j=0;j<n;j++)
            mat[i][j] = sc.nextInt();
      System.out.println("Transpose of the matrix");
      for (i=0;i<n;i++)
      {
         for(j=0;j<m;j++)
            System.out.print(mat[j][i]+" ");
         System.out.println();
      }
   }
}
