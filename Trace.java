import java.util.*;
class Trace
{
   public static void main(String args[])
   {
      int i,j, trace=0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the order of the matrix\t");
      int n = sc.nextInt();
      int m = sc.nextInt();
      int a[][] = new int[n][m];
      if(n==m)
      {
         System.out.println("Enter the elements of the matrix");
         for (i=0;i<n;i++)
            for(j=0;j<m;j++)
               a[i][j] = sc.nextInt();
         for (i=0;i<n;i++)
         {
            for(j=0;j<m;j++)
               if(i==j)
                  trace+=a[i][j];
         }
         System.out.println("Trace of the matrix is : "+ trace);
      }
      else
         System.out.println("Not possible");
   }
}
