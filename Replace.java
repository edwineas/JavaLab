import java.util.*;
class Replace
{
         public static void main(String args[])
         {
                  Scanner sc = new Scanner(System.in);
                  System.out.print("Enter the size of the array\t");
                  int n=sc.nextInt();
                  int arr[] = new int[n];
                  int i,flag=0;
                  System.out.println("Enter the elements");
                  for(i=0;i<n;i++)
                           arr[i]=sc.nextInt();
                  System.out.print("Enter the element to be replaced\t");                  
                  int e1=sc.nextInt();
                  System.out.print("Enter the element to be replaced with\t");                  
                  int e2=sc.nextInt();
                  for(i=0;i<n;i++)
                           if (arr[i]==e1)
                           {
                                 arr[i]=e2;  
                                 flag=1;
                           }
                  if(flag==0)
                           System.out.println("Element to be replced is not found");
                  else
                  {
                           System.out.println("Replaced array is");
                           for(i=0;i<n;i++)
                                    System.out.print(arr[i]+" ");
                  } 
	}
}
