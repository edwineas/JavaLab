import java.util.*;
class factors
{
    public static void main(String args[])
    {
        int i;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :\t");
        int n =  sc.nextInt();
        for(i=1;i<=n/2;i++)
            if(n%i==0)
                System.out.print(i+" ");
        System.out.println(n);
    }
}