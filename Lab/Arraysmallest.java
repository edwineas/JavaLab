import java.util.*;
class Arraysmallest
{
         public static void main(String args[])
         {
            int i;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array\t");
            int n=sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements");
            for(i=0;i<n;i++)
                    arr[i]=sc.nextInt();
            int s=arr[0];
            for(i=1;i<n;i++)
            {
                    if (s>arr[i])
                            s=arr[i];
            }
            System.out.println("Smallest element in the array is " + s);
         }
}
