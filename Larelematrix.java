import java.util.*;
class Larelematrix
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
      for (i=0;i<n;i++)
         for(j=0;j<m;j++)
            mat[i][j] = sc.nextInt();
      int l = mat[0][0];
      for (i=0;i<n;i++)
         for(j=0;j<m;j++)
            if(l<mat[i][j])
               l=mat[i][j];
      System.out.println("Largest element in the matrix is "+l);
   }
}
