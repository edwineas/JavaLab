import java.util.*;
class Matrixsum
{
   public static void main(String args[])
   {
      int i,j;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the order of the First matrix\t");
      int n1 = sc.nextInt();
      int m1 = sc.nextInt();
      int mat1[][] = new int[n1][m1];
      System.out.println("Enter the elements of the First matrix");
      for (i=0;i<n1;i++)
         for(j=0;j<m1;j++)
            mat1[i][j] = sc.nextInt();
      System.out.print("Enter the order of the Second matrix\t");
      int n2 = sc.nextInt();
      int m2 = sc.nextInt();
      int mat2[][] = new int[n2][m2];
      System.out.println("Enter the elements of the Second matrix");
      for (i=0;i<n2;i++)
         for(j=0;j<m2;j++)
            mat2[i][j] = sc.nextInt();
      int mat3[][] = new int[n2][m2];
      if(n1==n2&&m1==m2)
      {
         for (i=0;i<n1;i++)
            for(j=0;j<m1;j++)
               mat3[i][j] = mat1[i][j]+mat2[i][j];
         System.out.println("Sum of two matrix is");
         for (i=0;i<n1;i++)
         {
            for(j=0;j<m1;j++)
               System.out.print(mat3[i][j]+" ");
            System.out.println();
         }
      }
      else
      System.out.println("Sum of two matrix is not possible");
   }
}
