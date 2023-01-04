import java.util.*;
class Arraysum
{
         public static void main(String args[])
         {
                  int s=0;
                  Scanner sc = new Scanner(System.in);
                  System.out.print("Enter the size of the array\t");
                  int n=sc.nextInt();
                  int arr[] = new int[n];
                  System.out.println("Enter the elements");
                  for(int i=0;i<n;i++)
                  {
                           arr[i]=sc.nextInt();
                           s+=arr[i];
                  }
                  System.out.println("Sum of elements of the array is "+s);
                  
         }
}
