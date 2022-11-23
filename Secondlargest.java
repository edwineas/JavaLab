import java.util.*;
class Secondlargest
{
   public static void main(String args[])
   {  
      int a,b=0,i;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements");
      for(i=0;i<n;i++)
         arr[i]=sc.nextInt();
      a=arr[0];
      for(i=1;i<n;i++)
      {
         if (arr[i]>a)
         {
            b=a;
            a=arr[i];
         }
         else if(arr[i]>b)
            b=arr[i];
      }
      System.out.println("Second largest element in the array is " + b);
   }
}
